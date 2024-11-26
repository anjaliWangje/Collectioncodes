package Hashmap;

import java.util.HashMap;

//Java Program to Copy All Mappings from the Specified Map to Another Map:
public class Java3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        HashMap<String, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("map2 after copying: " + map2);

    }
}
