package Hashsetcollection;
// Write a Java program to find numbers less than 7 in a tree set.

import java.util.TreeSet;

public class Java9 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        System.out.println("Numbers less than 7:");
        for (Integer number : treeSet.headSet(7)) {
            System.out.println(number);
        }
    }
    }

