package org.lessons.java;

import java.util.Random;

public class Headphones extends Product{

    private String color;
    private Boolean type;

    // CONSTRUCTOR
    public Headphones(String productName, String productDescription, double price, double iva, String color, Boolean type) {
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

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
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
