package com.example.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("projects")
public class Project {

    @Id
    private int id;

    private String title;
    private String year;
    private String shortDescription;
    private String madeAt;
    private ArrayList<String> builtWith;
    private String thumbnail;
    private String link;
    private Boolean live;
    private Boolean featured;

    public Project(int id, String title, String year, String shortDescription, String madeAt, ArrayList<String> builtWith, String thumbnail, String link, Boolean live, Boolean featured) {
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.shortDescription = shortDescription;
        this.madeAt = madeAt;
        this.builtWith = builtWith;
        this.thumbnail = thumbnail;
        this.link = link;
        this.live = live;
        this.featured = featured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getMadeAt() {
        return madeAt;
    }

    public void setMadeAt(String madeAt) {
        this.madeAt = madeAt;
    }

    public ArrayList<String> getBuiltWith() {
        return builtWith;
    }

    public void setBuiltWith(ArrayList<String> builtWith) {
        this.builtWith = builtWith;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }
}
