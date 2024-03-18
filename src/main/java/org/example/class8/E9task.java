package org.example.class8;

public class E9task {
    public static void main(String[] args) {

        //Create a 2D array(shorter way) in which first array will consist of 4 names and second array wil
        // l contain grades. Then your program should print name of the students that has A and B grade
        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana"};//chat
        char[] grades = {'A', 'C', 'B', 'A'};

        // Check and print students with grades A or B
        for (int i = 0; i < studentNames.length; i++) {
            if (grades[i] == 'A' || grades[i] == 'B') {
                System.out.println(studentNames[i] + " has grade " + grades[i]);
            }
        }
    }

}