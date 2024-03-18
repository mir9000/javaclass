package org.example.class6;

import java.util.Scanner;

public class E1Task {
    public static void main(String[] args) {

        /*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries

 */

        Scanner scan=new Scanner(System.in);

        System.out.println(" Pleas Enter your country name");
        String country=scan.nextLine();

        switch (country){
            case "USA":
               System.out.println(" We speak English");
               break;


            case "Spain":
                System.out.println(" We speak Spanish");
                break;

            case "Russia":
                System.out.println(" We speak Russian");
                break;

            case "Egypt":
                System.out.println(" We speak Arabic");
                break;

            case "Afghanistan":
                System.out.println(" We speak Pashto");
                break;
           default:
                System.out.println("Country is not supported");


        }
    }
}
