package org.example.review3;

public class E5AndOperator {
    public static void main(String[] args) {

        boolean degree=true;
        double bankBalance=50000;
        boolean isTestPassed=true;//with & all condition must be true
        if(degree && bankBalance>3000 && isTestPassed){
            System.out.println("we can get admission in masters");
        }else{
            System.out.println("you can not");
        }



    }
}
