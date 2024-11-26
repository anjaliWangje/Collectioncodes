package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class jointwoarraylist {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        ArrayList<String> colors2=new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.addAll(colors2);
        System.out.println("joinedlist"+colors);
    }
}
