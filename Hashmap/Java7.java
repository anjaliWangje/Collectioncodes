package Hashmap;

import java.util.HashMap;
// Program to Test if a Map Contains a Mapping for the Specified Key
public class Java7 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        String tocheck="name";
        if(map.containsKey(tocheck)){
            System.out.println("cotains the key"+tocheck);
        }else{
            System.out.println("map not contain"+tocheck);
        }
    }
}
