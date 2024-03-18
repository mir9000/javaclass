package org.example.class5;

import java.util.Scanner;

public class E1Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter height in inches");
        int height = scan.nextInt();
        if (height < 60) {
            System.out.println("you are short");

            if (height < 72 || height > 60) {
                System.out.println("you are medium");}
            } else if (height > 72) {
                System.out.println("you are Tall");
            }
        }

    }