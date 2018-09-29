package com.aobri.siliconvalleytour.model;

/**
 * Model class representing Hotel details
 * created by Ahmed Nabri - 29/9/2018
 */
public class Hotel {

    private String name;
    private float rating;
    private String pricePerNight;
    private LocationData location;
    private int imageResourceId;

    public Hotel(String name, float rating, String pricePerNight, LocationData location, int imageResourceId) {
        this.name = name;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
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

    public String getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(String pricePerNight) {
        this.pricePerNight = pricePerNight;
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