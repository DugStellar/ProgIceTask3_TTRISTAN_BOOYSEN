package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question22 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");


        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at position " + i + ": " + colors.get(i)); 

        }
    }
}
