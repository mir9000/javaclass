package org.example.class5;

import java.util.Scanner;

public class E4Task {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println( " Do you have a credit card?");
        boolean creditCard=scan.nextBoolean();

        if(creditCard){
            System.out.println("what is the balance in your card?");

            double balance=scan.nextDouble();


        if(balance>1000)
            System.out.println("Pay off immediatly");

        }else{

            System.out.println(" you are elegible for a credit card");
        }

        }

    }

