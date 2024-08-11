package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        // Create an ArrayList of names
        List<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Specify the index of the element to update
        int index = 2; // Update the element at index 2 (third element)

        // New value for the element
        String newValue = "Eve";

        // Update the element using the set() method
        names.set(index, newValue);

        // Print the updated ArrayList
        System.out.println(names);
    }
}
