package org.example.class7;

import java.util.Arrays;

public class E1Practice3 {
    public static void main(String[] args) {//2 ways to make an array

        String [] names={"Viet","Sheila","Wais","Nabin","Maggy"};

        System.out.println(names[2]);


        String [] names1=new String[10];
        names1[0]="Viet";
        names1[1]="Sheila";
        names1[2]="wais";
        names1[3]="Nabin";
        names1[4]="Maggy";
        System.out.println(Arrays.toString(names1));
    }
}
