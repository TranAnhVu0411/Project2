package com.mycompany.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu
 */
import com.mycompany.processing.Crawl;
import com.mycompany.processing.News;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String args[]) throws IOException{
        String link = "https://vnexpress.net/chua-tam-chuc-chat-kin-du-khach-4248332.html";
        try{
//            String link="dlajfljdlldjsal";
            Document doc = Jsoup.connect(link).get();
            News me=new News();
            Crawl crawl = new Crawl();
            me.setTitle(crawl.getTitle(doc));
            me.setDescription(crawl.getDescription(doc));
            me.setDatetime(crawl.getDateTime(doc));
            me.setType(crawl.getType(doc));
            me.setImgLink(crawl.getImgLink(doc));
            me.setMainText(crawl.getMainText(doc));
            for(int i=0; i<me.getMainText().size(); i++){
                System.out.println(me.getMainText().get(i));
            }
            for(Object key: me.getImgLink().keySet()){
                System.out.println(key+" : "+me.getImgLink().get(key));
            }
            System.out.println("Datetime: "+me.getType());
        }catch(IllegalArgumentException ex){
            System.out.println("Error");
        }
    }
}
