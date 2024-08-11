package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<Integer>
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original list: " + numbers);

        // Reverse the list using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed list: " + numbers);
    }
}
