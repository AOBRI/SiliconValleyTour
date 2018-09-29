package com.aobri.siliconvalleytour.model;

/**
 * Model class representing Landmark details
 * created by Ahmed Nabri - 29/9/2018
 */
public class Landmark {

    private String name;
    private String description;
    private LocationData location;
    private int imageResourceId;

    public Landmark(String name, String description, LocationData location, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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