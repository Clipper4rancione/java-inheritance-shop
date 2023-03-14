package org.lessons.java;

import java.util.Random;

public class Smartphones extends Product{
    private String imei;
    private int storage;

    // CONSTRUCTOR
    public Smartphones(String productName, String productDescription, double price, double iva, int storage) {
        super(productName, productDescription, price, iva);
        Random r = new Random();
        this.imei = imei;
        this.storage = storage;
    }
    //GETTERS AND SETTERS


    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Smartphones{" + "/" +
                super.toString() +
                "imei=" + imei +
                ", storage=" + storage +
                '}';
    }
}
