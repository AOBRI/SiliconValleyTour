package com.aobri.siliconvalleytour.model;

/**
 * Model class representing Restaurant details
 * created by Ahmed Nabri - 29/9/2018
 */
public class Restaurant {

    private String name;
    private float rating;
    private String workhours;
    private LocationData location;
    private int imageResourceId;

    public Restaurant(String name, float rating, String workhours, LocationData location, int imageResourceId) {
        this.name = name;
        this.rating = rating;
        this.workhours = workhours;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getWorkhours() {
        return workhours;
    }

    public void setWorkhours(String workhours) {
        this.workhours = workhours;
    }

    public LocationData getLocation() {
        return location;
    }

    public void setLocation(LocationData location) {
        this.location = location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}