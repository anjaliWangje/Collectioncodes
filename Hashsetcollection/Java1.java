package Hashsetcollection;
//Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;

public class Java1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");

        // Append an element to the HashSet
        set.add("Shivam");

        // Display the HashSet
        System.out.println("HashSet after appending element: " + set);
    }
}


