package org.example.class6;

import java.util.Scanner;

public class E1LoopScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting poing of the loop");

        int start=scan.nextInt();

        System.out.println(" Please enter stopping number");
        int stop=scan.nextInt();

        while(start<stop){
            System.out.println(start);
            start++;



        }
    }
}
