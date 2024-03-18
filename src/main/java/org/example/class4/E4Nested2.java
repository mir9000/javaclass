package org.example.class4;

public class E4Nested2 {
    public static void main(String[] args) {
        boolean mainDoor = true;// if we change to false it will print else..main door is closed
        boolean room1 = false;//if we change to true  room1 open will show//
        boolean room2 = true;
        if (mainDoor) {// Ctrl+Alt+L is to organize the coding format

            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }

            if(room2){

                System.out.println("room2 is open");
            }else{

                System.out.println("Room 2 is closed");
            }

        } else {
            System.out.println("Main door is closed");
        }
    }
}
