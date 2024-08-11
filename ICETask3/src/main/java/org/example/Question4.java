package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        // Create an ArrayList of names
        List<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Specify the index of the element to retrieve
        int index = 2; // Retrieve the element at index 2 (third element)

        // Retrieve the element using the get() method
        String element = names.get(index);

        // Print the retrieved element
        System.out.println("Element at index " + index + ": " + element);
    }
}
