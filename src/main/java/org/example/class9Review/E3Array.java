package org.example.class9Review;

public class E3Array {
    public static void main(String[] args) {

        int[] numbers={10,25,45,66,85,100};

        for(int i=0;i< numbers.length;i--){// prints index 0 then an error

            System.out.println(i+" "+numbers[i]);
        }
    }
}
