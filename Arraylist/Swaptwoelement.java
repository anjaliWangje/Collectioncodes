package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swaptwoelement {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("original:"+colors);
        String temp=colors.get(0);
        colors.set(0,colors.get(2));
        colors.set(2,temp);
        System.out.println("after sawpping:"+colors);
    }
}


