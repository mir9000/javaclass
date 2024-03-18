package org.example.class4;

import java.util.Scanner;

public class E4Scanner1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the price of an apple");
        double price=scan.nextDouble();
        System.out.println( "price of an apple  "+price);
    }
}
