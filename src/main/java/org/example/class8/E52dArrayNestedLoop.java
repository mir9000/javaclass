package org.example.class8;

public class E52dArrayNestedLoop {
    public static void main(String[] args) {

        for(int j=0;j<7;j++){///for int j is the outer loop controlling how many times the inner loop should run
            for(int i=0;i<3;i++){//inner loop is printing the * 5times
                System.out.print("*");
            }
            System.out.println();//after the loop prints ***** this print statement will move to the new line
        }                         //and print***** again on the new line
    }
}
