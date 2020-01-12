package com.sosa.leslindesign;

import android.graphics.drawable.Drawable;

public class ModelHome {
    String name;
    int image;
    int background;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public ModelHome(String name, int image, int background) {
        this.name = name;
        this.image = image;
        this.background = background;
    }
}
