package Hashsetcollection;

import java.util.HashSet;

public class Java6 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        HashSet<String> set1 = ( HashSet<String>)set.clone();
        System.out.println("before clone:"+set);
        set.clone();
        System.out.println("after clone:"+set);
        System.out.println();
    }
}
