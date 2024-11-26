package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");

        Collections.sort(colors);
        System.out.println(colors);



        }

    }

