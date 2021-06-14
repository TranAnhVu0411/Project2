/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processing;

import com.mycompany.processing.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu
 */
public class SearchFunction{
    Service control = new Service();

    public String convertWebDateToJavaDate(String t){
        int s=t.indexOf(",");
        int e = t.lastIndexOf(",");
        String time = t.substring(e+2, e+7)+":00";
        String date = t.substring(s+2, e);
        String datetime =date+" "+time;
        return datetime;
    }
    
    public ArrayList<News> findByDateTime(ArrayList<News> initialResult ,String startDate, String endDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        ArrayList<News> result = new ArrayList<News>();
        if(startDate!="null" && endDate!="null"){
            for(News i: initialResult){
                try {
                    Date start = dateFormat.parse(startDate);
                    Date end = dateFormat.parse(endDate);
                    Date dateTime=dateFormat.parse(convertWebDateToJavaDate(i.getDatetime()));
                    if(dateTime.before(end) && dateTime.after(start)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(startDate=="null" && endDate!="null"){
            for(News i: initialResult){
                try {
                    Date end = dateFormat.parse(endDate);
                    Date dateTime=dateFormat.parse(convertWebDateToJavaDate(i.getDatetime()));
                    if(dateTime.before(end)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(startDate!="null" && endDate=="null"){
            for(News i: initialResult){
                try {
                    Date start = dateFormat.parse(startDate);
                    Date dateTime=dateFormat.parse(convertWebDateToJavaDate(i.getDatetime()));
                    if(dateTime.after(start)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            result=initialResult;
        }
        return result;
    }
    
    public ArrayList<News> findByCrawlDate(ArrayList<News> initialResult, String startDate, String endDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        ArrayList<News> result = new ArrayList<News>();
        if(startDate!="null" && endDate!="null"){
            for(News i: initialResult){
                try {
                    Date start = dateFormat.parse(startDate);
                    Date end = dateFormat.parse(endDate);
                    Date crawlDate=dateFormat.parse(i.getCrawlDate());
                    if(crawlDate.before(end) && crawlDate.after(start)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(startDate=="null" && endDate!="null"){
            for(News i: initialResult){
                try {
                    Date end = dateFormat.parse(endDate);
                    Date crawlDate=dateFormat.parse(i.getCrawlDate());
                    if(crawlDate.before(end)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(startDate!="null" && endDate=="null"){
            for(News i: initialResult){
                try {
                    Date start = dateFormat.parse(startDate);
                    Date crawlDate=dateFormat.parse(i.getCrawlDate());
                    if(crawlDate.after(start)){
                        result.add(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(SearchFunction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            result=initialResult;
        }
        return result;
    }
    
    
    public ArrayList<News>Find(String title, String author, String type, 
                               String startDateCrawl, String endDateCrawl,
                               String startDateTime, String endDateTime){
        ArrayList<News> initialResult = new ArrayList<News>();
        if(title!="" && author!="" && type!=""){
            initialResult = control.findNewsByTitleAuthorAndType(title, author, type);
        }else if(title=="" && author!="" && type==""){
            initialResult = control.findNewsByAuthor(author);
        }else if(title!="" && author=="" && type==""){
            initialResult = control.findNewsByTitle(title);
        }else if(title=="" && author=="" && type!=""){
            initialResult = control.findNewsByType(type);
        }else if(title!="" && author!="" && type==""){
            initialResult = control.findNewsByTitleAndAuthor(title, author);
        }else if(title!="" && author=="" && type!=""){
            initialResult = control.findNewsByTitleAndType(title, type);
        }else if(title=="" && author!="" && type!=""){
            initialResult = control.findNewsByTypeAndAuthor(type, author);
        }else{
            initialResult = control.getAllNews();
        }
        ArrayList<News> crawlDateResult = findByCrawlDate(initialResult, startDateCrawl, endDateCrawl);
        ArrayList<News> dateTimeResult = findByDateTime(initialResult, startDateTime, endDateTime);
        ArrayList<News> result = new ArrayList<News>();
        for(News i: crawlDateResult){
            if(dateTimeResult.contains(i))
                result.add(i);
        }
        return result;
    }
    
    public ArrayList<ArrayList<String>> convertResult(ArrayList<News> result){
        ArrayList<ArrayList<String>> convertResult = new ArrayList<ArrayList<String>>();
        for(News i: result){
            ArrayList<String> list = new ArrayList<String>();
            list.add(i.getTitle());
            list.add(i.getCrawlDate());
            convertResult.add(list);
        }
        return convertResult;
    }
}
