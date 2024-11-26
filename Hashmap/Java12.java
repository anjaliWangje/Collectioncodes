package Hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

//Write a Java program to get a collection view of the values contained in this map.
public class Java12 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        Collection<String> values = map.values();

        System.out.println("set of values in tha map");
        for(String value:values){
            System.out.println(value);
        }
    }
}




