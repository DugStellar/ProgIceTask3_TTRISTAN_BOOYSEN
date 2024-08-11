package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original list: " + numbers);

        int index1 = 1;
        int index2 = 3;

        // Swap elements at indices index1 and index2
        Collections.swap(numbers, index1, index2);

        System.out.println("Swapped list: " + numbers);
    }
}

