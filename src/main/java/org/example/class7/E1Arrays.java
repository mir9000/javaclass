package org.example.class7;

import java.util.Arrays;

public class E1Arrays {
    public static void main(String[] args) {

       String []  studentNames=new String[50];//1st way to write an array
       studentNames[4]="Lora";
       studentNames[10]="Wais";
       studentNames[2]="Omar";
       studentNames[7]="Orhan";
// Arrays.tostring is used to see all values in an array
        System.out.println(Arrays.toString(studentNames));

    }

}
