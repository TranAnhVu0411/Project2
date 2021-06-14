/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mycompany.processing.News;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;
import org.jsoup.Jsoup;

/**
 *
 * @author Vu
 */
public class MongoDBMain {
    public static void main(String args[]) throws IOException{
        String url="mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false";
        MongoClientURI clientURI=new MongoClientURI(url);
        MongoClient mongoClient=new MongoClient(clientURI);
        
        MongoDatabase mongoDatabase=mongoClient.getDatabase("project2");
        MongoCollection collection=mongoDatabase.getCollection("news");
        FindIterable<Document> iterDoc = collection.find(Filters.eq("website", "https://vnexpress.net/chua-tam-chuc-chat-kin-du-khach-4248332.html"));
        MongoCursor<Document> dbc = iterDoc.iterator();
        News news = new News();
//        List<Document> A=new ArrayList<Document>();
        while (dbc.hasNext()) {
//          A=dbc.next().get("img", A);
            Document a = dbc.next();
            news.setTitle((String)a.get("title"));
          news.setTitle((String)a.get("title"));
          news.setAuthor((String)a.get("author"));
          news.setDatetime((String)a.get("datetime"));
          news.setDescription((String)a.get("description"));
          ArrayList<String> b = new ArrayList<String>();
          b=a.get("maintext", b);
          news.setMainText(b);
          List<Document> imgDocument=new ArrayList<Document>();
          imgDocument=a.get("img", imgDocument);
          Map<String, String> link = new HashMap<String, String>();
          for(int i=0; i<imgDocument.size(); i++){
              link.put((String)imgDocument.get(i).get("imgdescription"),(String)imgDocument.get(i).get("imglink"));
          }
          news.setImgLink(link);
          break;
        }
        System.out.println(news.getAuthor());
//        for(int i=0; i<A.size(); i++){
//            System.out.println((String)A.get(i).get("imgdescription")+" : "+(String)A.get(i).get("imglink"));
//        }
    }
}
