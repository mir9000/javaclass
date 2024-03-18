package org.example.class4;

public class E1eElseIf {
    public static void main(String[] args) {

        int day= 10;//if we put anything over 7 it will print wrong day
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wedensday");

        }else if(day==4) {
            System.out.println("Thursday");
        }else if(day==5) {
            System.out.println("Friday");
        }else if(day==6) {
            System.out.println("Saturday");
        }else if(day==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Wrong day");
        }
    }

}
