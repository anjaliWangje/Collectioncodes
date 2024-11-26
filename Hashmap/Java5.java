package Hashmap;
//Java Program to Check Whether a Map Contains Key-Value Mappings (Empty) or Not:
import java.util.HashMap;

public class Java5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        boolean isEmpty = map.isEmpty();
        if (isEmpty) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings.");
        }
        map.put("Anjali", "name");
        isEmpty = map.isEmpty();
        if (isEmpty) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings.");
        }
    }
}
