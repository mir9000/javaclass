package org.example.class9Review;

public class E11NestedLoop {
    public static void main(String[] args) {

        for(int j=0;j<5;j++) {

            for (int i = j; i < 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
