package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<String>
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");


        System.out.println("Original list: " + colors);
        Collections.shuffle(colors);

        System.out.println("Shuffled list: " + colors);
    }
}
