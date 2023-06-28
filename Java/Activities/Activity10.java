package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("S");
        hs.add("H");
        hs.add("A");
        hs.add("H");
        hs.add("I");
        hs.add("S");
        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("H")) {
            System.out.println("H removed from the Set");
        } else {
            System.out.println("H is not present in the Set");
        }
        System.out.println("Checking if H is present: " + hs.contains("H"));
        System.out.println("Updated HashSet: " + hs);
    }
}
