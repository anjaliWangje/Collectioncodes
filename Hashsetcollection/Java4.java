package Hashsetcollection;
//Write a Java program to empty an hash set.
import java.util.HashSet;

public class Java4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("anjali");
        set.add("pranali");
        set.add("aboli");
        System.out.println("before clear:"+set);
        set.clear();
        System.out.println("after clear:"+set);
        System.out.println();



    }
}



