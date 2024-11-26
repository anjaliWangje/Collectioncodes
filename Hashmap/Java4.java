package Hashmap;

import java.util.HashMap;

//Java Program to Remove All Mappings from a Map:
public class Java4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        System.out.println("before clear"+map);
        map.clear();
        System.out.println("after clear: " + map);
        System.out.println();
    }
}
