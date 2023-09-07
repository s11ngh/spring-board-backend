package com.Coffee.Coffee.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Blog {

    @Id
    private String id;

    private int endYear;
    private double cityLng;
    private double cityLat;
    private String intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private int startYear;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private String relevance;
    private String pestle;
    private String source;
    private String title;
    private String likelihood;

    // Constructors
    public Blog() {
        // Default constructor
    }

    public Blog(int endYear, double cityLng, double cityLat, String intensity, String sector, String topic,
                String insight, String swot, String url, String region, int startYear, String impact,
                String added, String published, String city, String country, String relevance,
                String pestle, String source, String title, String likelihood) {
        this.endYear = endYear;
        this.cityLng = cityLng;
        this.cityLat = cityLat;
        this.intensity = intensity;
        this.sector = sector;
        this.topic = topic;
        this.insight = insight;
        this.swot = swot;
        this.url = url;
        this.region = region;
        this.startYear = startYear;
        this.impact = impact;
        this.added = added;
        this.published = published;
        this.city = city;
        this.country = country;
        this.relevance = relevance;
        this.pestle = pestle;
        this.source = source;
        this.title = title;
        this.likelihood = likelihood;
    }

    // Getters and setters
    // You can generate these using your IDE or write them manually

    // Other methods
    // You can add other methods as needed

    // Getter and setter methods for all fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public double getCityLng() {
        return cityLng;
    }

    public void setCityLng(double cityLng) {
        this.cityLng = cityLng;
    }

    public double getCityLat() {
        return cityLat;
    }

    public void setCityLat(double cityLat) {
        this.cityLat = cityLat;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    // Repeat the getter and setter methods for the remaining fields
}
