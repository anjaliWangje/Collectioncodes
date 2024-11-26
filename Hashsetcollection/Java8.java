package Hashsetcollection;

import java.util.HashSet;
import java.util.TreeSet;

//Write a Java program to convert a hash set to a tree set.
public class Java8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Anjali");
        set.add("aboli");
        set.add("prnali");
        TreeSet<String>treeset=new TreeSet<>(set);
        System.out.println(" tree set converted to hashset"+treeset);
    }
}
