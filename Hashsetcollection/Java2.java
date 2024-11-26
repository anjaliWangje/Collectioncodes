package Hashsetcollection;

import java.util.HashSet;

//Write a Java program to iterate through all elements in a hash list.
public class Java2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        System.out.println("Element in hashset");
        for(String name:set){
            System.out.println(name);

        }
    }
}
