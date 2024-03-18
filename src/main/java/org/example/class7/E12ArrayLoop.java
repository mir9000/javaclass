package org.example.class7;

public class E12ArrayLoop {
    public static void main(String[] args) {//find the largest num in the array

        int[] num={10,20,40,100,60,200};

        int largest=num[0];
        for(int i=1; i< num.length;i++){

            if(num[i]>largest){
                largest=num[i];
            }


        }
        System.out.println(largest);



    }
}
