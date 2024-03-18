package org.example.class3;

public class E8Type {
    public static void main(String[] args) {

        double num=10.5;
        int number =(int)num;// narrowing/manual/explicit its manual cuz we have to manually use (int) to convert
        System.out.println(number);


        int num1=10;
        float number1=num1;// widening/automatic/implicit/ if we move from bigger to smaller we use () if we move from small to big we dont use to specify ()
        System.out.println(number1);
    }
}
