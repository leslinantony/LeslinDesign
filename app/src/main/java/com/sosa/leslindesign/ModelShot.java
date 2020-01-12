package com.sosa.leslindesign;

public class ModelShot {
    int image;
    int background;

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

    public ModelShot(int image, int background) {
        this.image = image;
        this.background = background;
    }
}
