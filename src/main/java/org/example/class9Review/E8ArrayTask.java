package org.example.class9Review;

public class E8ArrayTask {
    public static void main(String[] args) {
        int[] numbers={10,25,45,66,85,100};
        int sum=0;

        int counter=0;//this used to keep track of numbers greater then 25

        // calculate the average num which is greater then 25
        //using enhanced loop


        for(int n:numbers){
            if(n>25) {
                //sum=sum+n;
                sum += n;
                counter++;

            }

        }
        System.out.println(sum/counter);
    }
}
