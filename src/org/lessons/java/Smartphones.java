package org.lessons.java;

import java.util.Random;

public class Smartphones extends Product{
    private int imei;
    private int storage;

    // CONSTRUCTOR
    public Smartphones(String productName, String productDescription, double price, double iva, int imei, int storage) {
        super(productName, productDescription, price, iva);
        Random r = new Random();
        imei = r.nextInt(1000, 999999);
        this.storage = storage;
    }
    //GETTERS AND SETTERS


    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
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
        return "Smartphones{" +
                "imei=" + imei +
                ", storage=" + storage +
                '}';
    }
}
