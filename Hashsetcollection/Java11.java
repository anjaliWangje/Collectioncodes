package Hashsetcollection;

import java.util.HashSet;

//Java Program to Compare Two Sets and Retain Elements That Are the Same
public class Java11 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Anjali");
        set1.add("aboli");
        set1.add("pranali");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Anjali");
        set2.add("aboli");
        set2.add("pranali");
        set1.retainAll(set2);
        System.out.println("same element in both set:"+set1);

    }
}
