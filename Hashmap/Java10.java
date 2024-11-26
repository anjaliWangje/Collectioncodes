package Hashmap;

import java.util.HashMap;

//Java Program to Get the Value of a Specified Key in a Map
public class Java10 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tdit", "class");
        map.put("name", "student");
        map.put("Dog", "Animal");
        String key="dog";
        String value=map.get(key);
        if(value!=null){
            System.out.println("value with key"+key+" "+value);
        }else {
            System.out.println("the key:"+ key);
        }
    }
}
