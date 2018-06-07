package com.example.shinji_win.listviewsimple;

import android.graphics.Bitmap;

public class User {
    private Bitmap icon;
    private String name;
    private String comment;

    public String getName() {
        return name;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public String getComment() {
        return comment;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
