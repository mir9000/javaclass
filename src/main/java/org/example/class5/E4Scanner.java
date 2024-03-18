package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your Last name");

        String lasttName=scanner.nextLine();// nextline method can print the entire paragraph

        System.out.println(lasttName);
    }
}
