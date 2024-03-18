package org.example.class7;

public class E1Practice4 {
    public static void main(String[] args) {
        // create an array or words: java,saturday,day,coding, is..
        //it should say saturday is java coding day

        String[] word = new String[10];
        word[0]="Java";
        word[1]="Saturday";
        word[2]="day";
        word[3]="coding";
        word[4]="is";
    //another way
        System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);


        String[] word1={"Java","Saturday","day","coding","is"};
        System.out.println(word1[1]+" "+word1[4]+" "+word1[0]+" "+word1[3]+" "+word1[2]);
    }
}
