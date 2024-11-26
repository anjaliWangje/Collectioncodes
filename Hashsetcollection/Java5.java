package Hashsetcollection;

import java.util.HashSet;

//Write a Java program to test if a hash set is empty or not.
public class Java5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the HashSet empty " + isEmpty);
        set.add("Anjali");
        set.add("aboli");
        set.add("prnali");
        isEmpty = set.isEmpty();
        System.out.println("Is the Hashset:"+isEmpty);
        System.out.println();

    }
}
