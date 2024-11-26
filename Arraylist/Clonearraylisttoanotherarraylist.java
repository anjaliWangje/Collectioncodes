package Arraylist;

import java.util.ArrayList;

public class Clonearraylisttoanotherarraylist {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> colors2=(ArrayList<String>)colors.clone();
        System.out.println("orignal colors"+colors);
        System.out.println("colned colors"+colors2);


    }
}
