package Hashmap;
//Java Program to Get a Set View of the Keys Contained in This Map:
import java.util.HashMap;
import java.util.Set;

public class Java11 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        Set<String>keyset=map.keySet();
        System.out.println("set of keys in tha map");
        for(String key:keyset){
            System.out.println(key);
        }
    }
}
