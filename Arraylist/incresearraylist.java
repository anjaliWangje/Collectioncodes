package Arraylist;

import java.util.ArrayList;

public class incresearraylist {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        colors.ensureCapacity(8);
        colors.add("class");
        colors.add("student");
        System.out.println("after incresing size"+ colors);
    }
}
