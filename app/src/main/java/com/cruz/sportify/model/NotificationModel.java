package com.cruz.sportify.model;

import android.media.Image;

/**
 * Created by Basilan on 7/1/2017.
 */

public class NotificationModel {
    private String text;
    private String hours;
    private int imgSrc;

    public NotificationModel(String text, String hours, int imgSrc) {
        this.text = text;
        this.hours = hours;
        this.imgSrc = imgSrc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
