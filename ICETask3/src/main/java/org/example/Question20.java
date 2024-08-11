package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question20 {
    public static void main(String[] args) {
        List<String>
        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Initial size: " + fruits.size());

        // Add more elements to increase the size
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println("Increased size: " + fruits.size());
    }
}

