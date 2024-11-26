package Hashsetcollection;

import java.util.HashSet;

//Write a Java program to compare two hash set
public class Java1o {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Anjali");
        set1.add("aboli");
        set1.add("pranali");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Anjali");
        set2.add("aboli");
        set2.add("pranali");
         boolean Equal = set1.equals(set2);

        if (Equal) {
            System.out.println("The HashSets are equal");
        } else {
            System.out.println("The HashSets are not equal");
        }
    }
}


