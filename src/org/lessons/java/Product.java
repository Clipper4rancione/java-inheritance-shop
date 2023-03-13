package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {
    Random random = new Random();
    private final int productCode = random.nextInt(1000, 99990);
    private String productName;
    private String productDescription;
    private double price;
    private double iva;

    public Product(String productName, String productDescription, double price, double iva){
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.iva = iva;
    }

    // GETTER
    public int getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public double getIva() {
        return iva;
    }

    // SETTER


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIva(double iva){
        this.iva = iva;
    }

    // METHODS

    public String getFormattedCode(){
        //tratto il numero come stringa
        String codiceString = String.valueOf(productCode);
        //continuo ad aggiungere - in testa alla stringa fino a che la stringa è lunga 8
        while(codiceString.length() < 8 ){
            codiceString = "0" + codiceString;
        }
        return codiceString;
    }
    public String nameCoded(){
        return productName + "-" + productCode;
    }
    public String priceWithIva(){
        DecimalFormat df = new DecimalFormat("##.##");
        return df.format(price * (1 + iva));
    }

    @Override
    public String toString() {
        return "Prodotto: " + productName +
                "Codice: " + productCode +
                "Descrizione: " + productDescription +
                "Prezzo: " + price;


    }

}

