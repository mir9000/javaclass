package org.example.class3;

public class E16RelationalOp {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        boolean result=num1<=num2;// we can store the result in boolean and print it too
        System.out.println(num1<=num2);
        // <= means less or equal to so the result will be false
        // 10 is not less or equal to 20
        System.out.println(result);


        int num3=5;
        int num4=10;
        System.out.println(num3>=num4);// false
        System.out.println(num3<=num4);//True
    }
}
