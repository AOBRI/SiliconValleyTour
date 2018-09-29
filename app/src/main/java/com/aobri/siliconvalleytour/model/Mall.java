package com.aobri.siliconvalleytour.model;

/**
 * Model class representing Mall details
 * created by Ahmed Nabri - 29/9/2018
 */
public class Mall {

    private String name;
    private String workhours;
    private LocationData location;
    private int imageResourceId;

    public Mall(String name, String workhours, LocationData location, int imageResourceId) {
        this.name = name;
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