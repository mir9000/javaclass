package org.example.review3;

import java.util.Scanner;

public class E7Loop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int number =10;
        while(number>5){
            System.out.println("please enter a Number");
            number=scan.nextInt();
        }
    }
}
