/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processing;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author Vu
 */
public class Service {
    public MongoDatabase Connect(){
        String url="mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false";
        MongoClientURI clientURI=new MongoClientURI(url);
        MongoClient mongoClient=new MongoClient(clientURI);
        return mongoClient.getDatabase("project");
    }
    
    public News convertDocToObject(Document doc){
        News news = new News();
        news.setWebsite((String)doc.get("website"));
        news.setTitle((String)doc.get("title"));
        news.setType((String)doc.get("type"));
        news.setAuthor((String)doc.get("author"));
        news.setDatetime((String)doc.get("datetime"));
        news.setDescription((String)doc.get("description"));
        news.setCrawlDate((String)doc.get("crawldate"));
        ArrayList<String> text=new ArrayList<String>(); 
        text = doc.get("maintext", text);
        news.setMainText(text);
        List<Document> imgDocument=new ArrayList<Document>();
        imgDocument=doc.get("img", imgDocument);
        Map<String, String> link = new HashMap<String, String>();
        for(int i=0; i<imgDocument.size(); i++){
            link.put((String)imgDocument.get(i).get("imgdescription"),(String)imgDocument.get(i).get("imglink"));
        }
        news.setImgLink(link);
        return news;
    }
    
    public void addNews(News data){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        Document document=new Document("website", data.getWebsite());
        document.append("title", data.getTitle());
        document.append("description", data.getDescription());
        document.append("datetime", data.getDatetime());
        document.append("author", data.getAuthor());
        document.append("maintext", data.getMainText());
        List<Document> Img = new ArrayList<Document>();
        for(Object key: data.getImgLink().keySet()){
            Document img = new Document("imgdescription", key);
            img.append("imglink", data.getImgLink().get(key));
            Img.add(img);
        }
        document.append("img", Img);
        document.append("type", data.getType());
        document.append("crawldate", data.getCrawlDate());
        collection.insertOne(document);
    }
    
    public ArrayList<News> getAllNews(){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find();
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> newsList = new ArrayList<News>();
        while (dbc.hasNext()) {
          News news = new News();
          Document doc = dbc.next();
          news=convertDocToObject(doc);
          newsList.add(news);
        }
        return newsList;
    }
    
    public News getNewsFromTitleAndDate(String title, String date){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.and(Filters.eq("title", title), Filters.eq("crawldate", date)));
        MongoCursor<Document> dbc = iterDoc.iterator();
        News news = new News();
        while (dbc.hasNext()) {
          Document doc = dbc.next();
          news=convertDocToObject(doc);
        }
        return news;
    }
    
    public ArrayList<ArrayList<String>> getTitleAndDate(){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find();
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<ArrayList<String>> websiteList = new ArrayList<ArrayList<String>>();
        while (dbc.hasNext()) {
          Document doc = dbc.next();
          ArrayList<String> list = new ArrayList<String>();
          String title=(String)doc.get("title");
          String date=(String)doc.get("crawldate");
          list.add(title);
          list.add(date);
          websiteList.add(list);
        }
        return websiteList;
    }
    
    public ArrayList<News> findNewsByTitle(String title){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.regex("title", title));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByAuthor(String author){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.regex("author", author));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByType(String type){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.regex("type", type));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByTitleAndType(String title, String type){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.and(Filters.regex("title", title), Filters.regex("type", type)));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByTitleAndAuthor(String title, String author){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.and(Filters.regex("title", title), Filters.regex("author", author)));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByTypeAndAuthor(String type, String author){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.and(Filters.regex("type", type), Filters.regex("author", author)));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
    public ArrayList<News> findNewsByTitleAuthorAndType(String title, String author, String type){
        MongoDatabase mongoDatabase = Connect();
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.and(Filters.and(Filters.regex("title", title), Filters.regex("author", author)), Filters.regex("type", type)));
        MongoCursor<Document> dbc = iterDoc.iterator();
        ArrayList<News> result=new ArrayList<News>();
        if(dbc.hasNext()==false){
            return result;
        }else{
            while (dbc.hasNext()) {
                Document doc = dbc.next();
                result.add(convertDocToObject(doc));
            }
            return result;
        }
    }
    
}    
