package org.example.class9Review;

public class E5array {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66, 85, 100};

        for (int i = numbers.length - 1; i >= 0; i--) {// prints index in reverse order
            // we have to use numbers.lenght-1 cuz numbers.lenght is 6 so it
            //will show an error..we have to make it 5 to enter the loop.
            //there is mo index 6 so it aill give an error
            System.out.println(i + " " + numbers[i]);
        }
    }
}