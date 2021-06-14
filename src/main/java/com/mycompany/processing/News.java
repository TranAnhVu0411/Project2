package com.mycompany.processing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vu
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class News {
    private String Website;
    private String Title;
    private String Description;
    private String Type;
    private String Datetime;
    private ArrayList<String> MainText = new ArrayList<String>();
    private Map<String, String> ImgLink = new HashMap();
    private String Author;
    private String CrawlDate;
    
    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDatetime() {
        return Datetime;
    }

    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    public ArrayList<String> getMainText() {
        return MainText;
    }

    public void setMainText(ArrayList<String> MainText) {
        this.MainText = MainText;
    }

    public Map<String, String> getImgLink() {
        return ImgLink;
    }

    public void setImgLink(Map<String, String> ImgLink) {
        this.ImgLink = ImgLink;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getCrawlDate() {
        return CrawlDate;
    }

    public void setCrawlDate(String CrawlDate) {
        this.CrawlDate = CrawlDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final News other = (News) obj;
        if (!Objects.equals(this.Website, other.Website)) {
            return false;
        }
        if (!Objects.equals(this.Title, other.Title)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        if (!Objects.equals(this.Datetime, other.Datetime)) {
            return false;
        }
        if (!Objects.equals(this.Author, other.Author)) {
            return false;
        }
        if (!Objects.equals(this.CrawlDate, other.CrawlDate)) {
            return false;
        }
        if (!Objects.equals(this.MainText, other.MainText)) {
            return false;
        }
        if (!Objects.equals(this.ImgLink, other.ImgLink)) {
            return false;
        }
        return true;
    }  
}
