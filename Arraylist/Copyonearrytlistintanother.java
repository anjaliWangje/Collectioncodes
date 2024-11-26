package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Copyonearrytlistintanother {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> colors2=new ArrayList<>(colors);
        System.out.println(colors2);



    }
}
