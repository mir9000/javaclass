package org.example.review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your grade");

        char grade=scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Very good grade");
                break;

            case 'B':
                System.out.println("Good grade");
                break;
            case 'C':
                System.out.println("you need to work hard");
                break;
            case 'D':
                System.out.println("You failed");
                break;
            default:
                System.out.println("You need to try again");





        }
    }
}
