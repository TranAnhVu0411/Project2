/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.processing.Crawl;
import com.mycompany.processing.News;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

/**
 *
 * @author Vu
 */
public class GetData{
    public News getData(String url) throws IOException{
        Document doc = Jsoup.connect(url).get();
        News me=new News();
        Crawl crawl = new Crawl();
        me.setType(crawl.getType(doc));
        me.setDatetime(crawl.getDateTime(doc));
        me.setMainText(crawl.getMainText(doc));
        me.setTitle(crawl.getTitle(doc));
        me.setDescription(crawl.getDescription(doc));
        me.setImgLink(crawl.getImgLink(doc));
        return me;
    }
}
