package org.example.class6;

import java.util.Scanner;
/*Allow user to enter grade (A, B, or C etc...) and
then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
any other grade --> Not Acceptable. At the end your program should
print which grade was entered by a user with explanation./*

 */
public class E1Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter your Grade");
        char grade=scan.next().toLowerCase().charAt(0);

        switch (grade){

            case 'a':
                System.out.println("A-Excellent");
                break;
            case 'b':
                System.out.println("B-Good");
                break;
            case 'c':
                System.out.println("C-Average");
                break;
            case 'd':
                System.out.println("D-Bad");
                break;
            case 'f':
                System.out.println("F-Fail");
                break;
            default:
                System.out.println(" Other grade not acceptable");
        }
    }
}
