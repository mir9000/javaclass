package org.example.class9Review;

public class E9ArrayTask {
    public static void main(String[] args) {

        //count how many even numbers are present in the array
        int[] numbers={10,25,45,66,85,100,26,89,56,33};
        int counter=0;
        for(int n:numbers){
            if(n%2==0){
                counter++;


            }
        }
        System.out.println(counter);
    }
}
