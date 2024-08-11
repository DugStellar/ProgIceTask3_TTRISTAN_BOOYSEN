package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question17 {
    public static void main(String[] args) {
        List<String>
        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original list: " + fruits);

        // Empty the list using clear()
        fruits.clear();

        System.out.println("Empty list: " + fruits);
    }
}
