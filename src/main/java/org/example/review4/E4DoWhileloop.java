package org.example.review4;

import java.util.Scanner;

public class E4DoWhileloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       // System.out.println("Please Enter the number");
        //int number= scan.nextInt();

        //while(number<10){
           // System.out.println("Please Enter the number");
            //number= scan.nextInt();


        int number=0;  //do while loop works best if we take input from user
        do{
            System.out.println("Please Enter the number");
             number= scan.nextInt();

        }while(number<10);


        }

    }

