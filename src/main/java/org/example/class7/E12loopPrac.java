package org.example.class7;

public class E12loopPrac {
    public static void main(String[] args) {

        int[] num={10,20,40,100,60,200};
        int max=num[0];
        for(int n:num){

            if(max<n){
                max=n;
            }


        }
        System.out.println(max);
    }
}
