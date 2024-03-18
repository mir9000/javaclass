package org.example.class5;

import java.util.Scanner;

public class E3Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(" input your city name");
        String cityName=scan.nextLine();
        System.out.println(" enter the temp in Fahrenheit");
        double fahren=scan.nextDouble();
        //convert Fahrenheit in to celsius
       double celius=(fahren-32)* 5.0/9.0;
        System.out.println("The temperature in the city "+ cityName+" is "+celius+" C");

        // asking city name and converting the F into Celcius once the input is put into F
    }
}
