package Hashsetcollection;
//Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class Java3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        System.out.println(set);
        int size= set.size();
        System.out.println("Element in hashset:"+size);



        }
    }



