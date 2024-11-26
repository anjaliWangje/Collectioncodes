package Arraylist;

import java.util.ArrayList;

public class Replcesecondelement {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before replace:"+colors);
        colors.set(1,"green");
        System.out.println("after replace:"+colors);
    }
}
