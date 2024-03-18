package org.example.class9Review;

public class E6Array {
    public static void main(String[] args) {
        int[] numbers={10,25,45,66,85,100};

        int sum=0;

        //for(int num:numbers){
           // sum+=num;



        //}

        //OR
        for(int i =0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        double average=(double)sum/ numbers.length;//we converted int sum to double sum to get the decimal points
        System.out.println(average);


    }
}
