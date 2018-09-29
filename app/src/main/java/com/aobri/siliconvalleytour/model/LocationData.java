package com.aobri.siliconvalleytour.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class LocationData {

    private String address;
    private float latitude;
    private float longitude;

    public LocationData(String address) {
        this.address = address;
    }

    public LocationData(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void showAddressInMap(Context context) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(Uri.parse("geo:0,0?q=" + address));
        if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(mapIntent);
        }
    }

    public void showCoordinatesInMap(Context context) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(Uri.parse("geo:" + latitude + "," + longitude));
        if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(mapIntent);
        }
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}