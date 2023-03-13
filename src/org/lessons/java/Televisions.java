package org.lessons.java;

public class Televisions extends Product{

    private int inches;
    private boolean isSmart;

    // CONSTRUCTOR
    public Televisions(String productName, String productDescription, double price, double iva, int inches, boolean isSmart) {
        super(productName, productDescription, price, iva);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    // GETTER AND SETTERS


    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    // TO STRING


    @Override
    public String toString() {
        return "Televisions{" +
                "inches=" + inches +
                ", isSmart=" + isSmart +
                '}';
    }
}
