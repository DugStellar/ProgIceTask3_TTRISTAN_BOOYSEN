package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
        public static void main(String[] args) {
            // Create an ArrayList
            List<String> colors = new ArrayList<>();

            // Add some colors
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");

            // Iterate through the ArrayList using a for-each loop
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }
