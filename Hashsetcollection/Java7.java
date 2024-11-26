package Hashsetcollection;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array.
public class Java7 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        String[]array=new String[set.size()];
        set.toArray();
        System.out.println("hashsetconver to array");
        for(String name:set)
            System.out.println(name);
        System.out.println();
    }
}
