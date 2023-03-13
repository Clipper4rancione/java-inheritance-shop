package org.lessons.java;

import java.util.Random;

public class Headphones extends Product{

    private String color;
    private String type;

    // CONSTRUCTOR
    public Headphones(String productName, String productDescription, double price, double iva) {
        super(productName, productDescription, price, iva);
        this.color = color;
        this.type = type;
    }

    // GETTERS AND SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // TO STRING


    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
