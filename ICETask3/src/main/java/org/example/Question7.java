package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question7 {
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

        // Element to search for
        String searchElement = "Blue";

        // Check if the element is present using contains() method
        if (colors.contains(searchElement)) {
            System.out.println("Element found in the ArrayList.");
        } else {
            System.out.println("Element not found in the ArrayList.");
        }
    }
}
