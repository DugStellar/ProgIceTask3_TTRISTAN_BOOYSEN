package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer>
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        // Extract a portion of the list from index 1 (inclusive) to index 3 (exclusive)
        List<Integer> subList = numbers.subList(1, 3);

        System.out.println("Original list: " + numbers);
        System.out.println("Extracted portion: " + subList);
    }
}
