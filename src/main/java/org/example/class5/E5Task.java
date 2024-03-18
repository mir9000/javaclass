package org.example.class5;

import java.util.Scanner;

public class E5Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(" Please Enter how many years you have worked?");
        double year=scan.nextDouble();


        if(year>=5) {
            System.out.println("Please enter your manual salary");
            double salary = scan.nextDouble();
            System.out.println(" You are eligible for the bonus");
        if(salary>50000) {
            System.out.println(" your bonus is 5000");


        }else

                System.out.println("your bonus is 3000");
            }else{
                System.out.println("you are not eligible for bonus");
            }


        }
    }

