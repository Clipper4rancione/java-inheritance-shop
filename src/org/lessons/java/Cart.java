package org.lessons.java;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto! Quanti prodotti vorresti aggiungere al tuo carrello?");
        int cartLength = Integer.parseInt(scan.nextLine());
        Product[] cart = new Product[cartLength];




        for (int i = 0; i < cart.length; i++) {
            System.out.println("Che tipo di prodotto vorresti aggiungere al carrello?");
            System.out.println("1 - Smartphone 2 - Cuffie 3 - Televisori");
            int userChoice = Integer.parseInt(scan.nextLine());

            switch (userChoice){
                case 1 -> {

                    System.out.println("Hai scelto smartphone");
                    System.out.println("Inserisci il nome dello smartphone");
                    String productName = scan.nextLine();
                    System.out.println("Inserisci la descrizione");
                    String productDescription = scan.nextLine();
                    System.out.println("Inserisci il prezzo");
                    double price = Double.parseDouble(scan.nextLine());
                    System.out.println("inserisci l'iva");
                    double iva = Double.parseDouble(scan.nextLine());
                    System.out.println("Quanto deve essere grande la memoria?");
                    int storage = Integer.parseInt(scan.nextLine());
                    Smartphones phone = new Smartphones(productName, productDescription, price, iva, storage);

                }
            }
        }
    }
}
