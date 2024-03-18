package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a byte numer");
        byte smallBox=scanner.nextByte();

        System.out.println("Please enter a double number");
        double doubleNum=scanner.nextDouble();

        System.out.println("Please enter a boolean");

        boolean myBool=scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(doubleNum);
        System.out.println(myBool);






    }
}
