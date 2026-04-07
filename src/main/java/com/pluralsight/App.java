package com.pluralsight;

public class App {
    public static void main(String[] args) {
        System.out.println("A nice little message");
        System.out.println("One more");

        var price = 10;
        var tax = 3F;

        if (price > 10) {
            System.out.println("Item is too expensive");
        }
        else
            if (tax > 2) {
                System.out.println("Tax is too much");
            }
            else
                System.out.println(tax * price);
    }
}
