package Hashmap;

import java.util.HashMap;

//Java Program to Count the Number of Key-Value (Size) Mappings in a Map:
public class Java2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        int size=map.size();
        System.out.println("HashMap with key-value pairs: " + size);
    }

}


