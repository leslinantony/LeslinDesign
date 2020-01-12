package com.sosa.leslindesign;

public class BucketModel {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public BucketModel(String name, int background) {
        this.name = name;
        this.background = background;
    }

    int background;
}
