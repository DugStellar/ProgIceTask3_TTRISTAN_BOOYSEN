package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question8 {
    public static void main(String[] args)
    {
        // Create an ArrayList of numbers
        List<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println(numbers);
    }
}