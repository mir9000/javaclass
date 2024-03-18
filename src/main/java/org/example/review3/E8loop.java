package org.example.review3;

import java.util.Scanner;

public class E8loop {
    public static void main(String[] args) {

        // 10 20 30 40 50 if we dont want to write the 30

        int num=10;

        while(num<=50){
            if( num!=30)
            System.out.println(num);
            num+=10;
        }
// write 10 20 30 40 50
        int num1=10;

        while(num1<=50){

                System.out.print(num1+"  ");
            num1+=10;
        }

    }
}
