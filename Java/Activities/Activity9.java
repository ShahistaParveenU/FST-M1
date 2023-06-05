package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add(3, "Grapes");
        myList.add(1, "Litchi");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Do we have pineapple in the list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Litchi");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
