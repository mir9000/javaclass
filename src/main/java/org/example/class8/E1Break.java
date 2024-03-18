package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String[] names={"Wais","James","Omar","Aladin","Ana","Silva"};

        //search for a name james if it is present print on the consore name is present

        //String name="James";   we can use that and insteat of putting james on if statement we can put name
        for(String n:names){

            if(n.equals("James")) {
                System.out.println(n+" Name is present");
                break;
            }
        }
    }
}
