package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        List<String>
        fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Orange");

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Pineapple");

        // Create a new list to hold the combined fruits
        List<String> combinedFruits = new ArrayList<>();
        combinedFruits.addAll(fruits1);
        combinedFruits.addAll(fruits2);

        System.out.println("Combined fruits: " + combinedFruits);
    }
}
