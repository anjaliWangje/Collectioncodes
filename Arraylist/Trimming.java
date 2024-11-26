package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Trimming {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before trimming"+colors);
        colors.trimToSize();
        System.out.println("after trimming:"+colors);
    }
}
