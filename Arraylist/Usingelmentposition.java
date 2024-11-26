package Arraylist;

import java.util.ArrayList;

public class Usingelmentposition {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(" elemnt of the arraylislt");
        for(int i=0;i<colors.size();i++){
            System.out.println("element "+i+":"+colors.get(i));
        }
    }
}
