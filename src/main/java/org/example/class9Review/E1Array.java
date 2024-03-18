package org.example.class9Review;

public class E1Array {
    public static void main(String[] args) {

        int[] numbers={10,25,45,66,85,100};

        System.out.println(numbers.length+" element is saved on the array");//tells you how many elements are there
        System.out.println(numbers[3]+" is the 3rd element on the array starting from 0");
       // System.out.println(numbers[-5]); this will show an error cuz -5 is not in the index range
        //how we can print all elements in the array using a loop

        for(int i=0;i< numbers.length;i++){
            //i will run 0 to 5 and print those indexes like numbers[o]to[5]

            System.out.println(i+" is assinged to index  "+numbers[i]);
        }
    }

}
