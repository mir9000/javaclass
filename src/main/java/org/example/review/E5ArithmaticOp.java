package org.example.review;

public class E5ArithmaticOp {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        int result=num1+num2;
        System.out.println(result);
        // we cant add int with string  it will concatinate  10 will be added with string 10 then 10
        System.out.println(10+"10"+10);
        // in this case first it will add 10+10 then concatinate with string 10
        System.out.println(10+10+"10");


    }
}
