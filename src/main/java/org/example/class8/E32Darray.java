package org.example.class8;

public class E32Darray {
    public static void main(String[] args) {
        //create a 2D array .  2d array is multiple 1d array
        /* 10 20 40 50
           22 40 90 65
           15 50 33 30
         */

        int[][] matrix={
                {10 ,20 ,40, 50},
                {22, 40, 90, 65},
                {15 ,50, 33, 30}
        };

        System.out.println(matrix[2][3]);
        System.out.println(matrix[1][3]);
        System.out.println(matrix[2][0]);
        System.out.println(matrix[1][0]);
    }
}
