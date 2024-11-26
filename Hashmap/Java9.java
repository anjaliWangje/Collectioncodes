package Hashmap;
//Java Program to Create a Set View of the Mappings Contained in a Map:
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Java9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("set view map");
        for(Map.Entry<String,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
            System.out.println();
        }

    }
}
