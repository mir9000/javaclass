package org.example.class3;

public class E22IfElseTask {
    public static void main(String[] args) {

       //```Create a Java program and name it Temperature Check. Create variable to store temperature.
        // Your program should check if temperature is below 32 then it should print “Water will freeze with temperature __”,
        // otherwise “Water will NOT freeze with temperature __”.
        //```

        double temp=40;
        if(temp<32){
            System.out.println("Water will freeze with temperature"+ temp);
        }else{
            System.out.println("Water will not freeze with temperature "+ temp);
        }
    }
}
