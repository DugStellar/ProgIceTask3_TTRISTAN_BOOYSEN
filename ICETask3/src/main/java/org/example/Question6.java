package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args)
    {
        // Create an ArrayList of colors
        List<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Remove the third element (index 2)
        colors.remove(2);

        // Print the updated ArrayList
        System.out.println(colors);
    }
}
