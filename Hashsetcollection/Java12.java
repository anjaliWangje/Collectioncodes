package Hashsetcollection;

import java.util.HashSet;

//Java Program to Remove All Elements from a HashSet:
public class Java12 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        set.clear();
        System.out.println("removing all element clear:"+set);
        System.out.println();

    }
}
