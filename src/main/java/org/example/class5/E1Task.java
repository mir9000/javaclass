package org.example.class5;

import java.util.Scanner;

public class E1Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("What is the amount of loan needed");
        double loanAmout=scan.nextDouble();
        if(loanAmout<=200000){
            System.out.println("you can get the loan");
        }else{
            System.out.println(" You are rejected");
        }
    }
}
