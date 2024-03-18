package org.example.class5;

import java.util.Scanner;

public class E2Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How old are you");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println(" you are qualified to get a license");
        }else{
            System.out.println("You need a permit");


        }
    }
}
