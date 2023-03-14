package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto! Quanti prodotti vorresti aggiungere al tuo carrello?");
        int cartLength = Integer.parseInt(scan.nextLine());
        Product[] cart = new Product[cartLength];




        for (int i = 0; i < cartLength; i++) {
            System.out.println("Che tipo di prodotto vorresti aggiungere al carrello?");
            System.out.println("1 - Smartphone 2 - Cuffie 3 - Televisori");
            int userChoice = Integer.parseInt(scan.nextLine());
            System.out.println("Hai scelto smartphone");
            System.out.println("Inserisci il nome dello smartphone");
            String productName = scan.nextLine();
            System.out.println("Inserisci la descrizione");
            String productDescription = scan.nextLine();
            System.out.println("Inserisci il prezzo");
            double price = Double.parseDouble(scan.nextLine());
            System.out.println("inserisci l'iva");
            double iva = Double.parseDouble(scan.nextLine());

            switch (userChoice){
                case 1 -> {
                    System.out.println("IMEI: ");
                    String imei = scan.nextLine();
                    System.out.println("Quanto deve essere grande la memoria?");
                    int storage = Integer.parseInt(scan.nextLine());


                    cart[i] = new Smartphones(productName,productDescription, price, iva, storage);
                    break;

                }
                case 2 -> {
                    System.out.println("Di che colore sono?");
                    String color = scan.nextLine();
                    System.out.println("Sono Wireless: 1 = Si, 2 = No");
                    Boolean type = Boolean.valueOf(scan.nextLine());
                    cart[i] = new Headphones(productName, productDescription, price, iva, color, type);

                }
                case 3 -> {
                    System.out.println("Quanti pollici è?");
                    int inches = Integer.parseInt(scan.nextLine());
                    System.out.println("È Smart? 1 = Si, 2 = No");
                    boolean isSmart = Boolean.parseBoolean(scan.nextLine());

                    cart[i] = new Televisions(productName, productDescription, price, iva, inches, isSmart);
                }
                default -> {
                    System.out.println("input non valido");
                    break;
                }
            }

        }
        for (int i = 0; i < cart.length; i++) {
            System.out.println("prodotto " + (i + 1));
            System.out.println(cart[i]);
        }
    }
}
