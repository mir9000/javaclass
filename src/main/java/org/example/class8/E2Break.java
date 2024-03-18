package org.example.class8;

public class E2Break {
    public static void main(String[] args) {
        int[]numbers={10,60,30,55,60,45,100,38};

        for(int num:numbers){
            if(num>50){
                continue;//this ignore num greater then 50
            }

            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num-10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println("******");



        }
    }
}
