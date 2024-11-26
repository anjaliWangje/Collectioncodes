package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Extractportion {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> sublist=new ArrayList<>(colors.subList(1,4));

        System.out.println(sublist);
    }
}
