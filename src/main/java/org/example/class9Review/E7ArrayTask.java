package org.example.class9Review;

public class E7ArrayTask {
    public static void main(String[] args) {
        int[] numbers={10,25,45,66,85,100};
        int sum=0;

        for(int n:numbers){
            //enhanced for makes things simple
            //it takes the number 1 by 1 and placing it inside the integer
            // variable n we created
           // System.out.println(n);
            //sum=sum+n;
            sum+=n;




            }
        System.out.println(sum/ numbers.length);


    }
}
