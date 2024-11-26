package Hashmap;

import java.util.HashMap;

public class Java6 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        System.out.println("before hashmap"+map);
        HashMap<String, String> clone = (HashMap<String, String>) map.clone();
        System.out.println("before shallowcopy"+map);
    }
}
