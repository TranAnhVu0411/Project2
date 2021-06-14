/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Vu
 */
public class Crawl {
    public String getTitle(Document doc) {
        return doc.getElementsByTag("title").first().ownText();
    }

    public String getType(Document doc){
        Elements elm = doc.getElementsByClass("header-content width_common");
        Elements type=elm.select("a");
        if(type.size()==0){
            return "Null";
        }else{
            String Type="";
            for(int i=0; i<type.size(); i++){
                Type=Type+type.get(i).attr("title");
                if(i!=type.size()-1){
                    Type=Type+", ";
                }
            }
            return Type;
        }
    }
    
    public String getAuthor(Document doc){
        Elements elm = doc.select("p[class=author_mail]");
        if(elm.size()!=0){
            return elm.get(0).text();
        }else{
            Elements elm1 =doc.select("p[class=Normal]");
            return elm1.get(elm1.size()-1).text();
        }
    }
    
    public String getDescription(Document doc){
        Elements elm = doc.select("p[class=Description]");
        if(elm.size()==0){
            return "Null";
        }else{
            return elm.get(0).ownText();
        }
    }
    
    public String getDateTime(Document doc){
        Elements elm =doc.select("span[class=Date]");
        if(elm.size()==0){
            return "Null";
        }else{
            return elm.get(0).ownText();
        }
    }
    
    public ArrayList<String> getMainText(Document doc) {
        Elements elm = doc.select("p[class=Normal]");
        ArrayList<String> text = new ArrayList<String>();
        if(elm.size()==0){
            text.add("Null");
            return text;
        }else{
            for (int i = 0; i < elm.size(); i++){
                if(i==elm.size()-1){
                    Elements elm1 = doc.select("p[class=author_mail]");
                    if(elm1.size()!=0){
                        text.add(elm.get(i).text());
                        System.out.println(elm.get(i).text());
                    }
                }else{
                    text.add(elm.get(i).text());
                }
            }   
            return text;
        }
    }

    public Map<String, String> getImgLink(Document doc) {
        Elements elm = doc.select("img[itemprop = contenturl]");
        Elements cap = doc.select("p[class=Image]");
        Map<String,String> link = new HashMap<String,String>();
        if(elm.size()==0){
            link.put("Null", "Null");
        }else{
            for (int i = 0; i < elm.size(); i++) {
                link.put(cap.get(i).ownText(),elm.get(i).attr("data-src"));
            } 
        }
        return link;
    }
}
