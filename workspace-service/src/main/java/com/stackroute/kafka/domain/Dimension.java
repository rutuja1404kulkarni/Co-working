package com.stackroute.kafka.domain;

import lombok.Data;
@Data
public class Dimension {
    int width;
    int height;

    public Dimension() {
    }

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}