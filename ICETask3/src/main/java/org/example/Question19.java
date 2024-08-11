package org.example;
import java.util.ArrayList;
import java.util.List;


public class Question19 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original capacity: " + fruits.capacity());

        // Trim the capacity to the list size
        fruits.trimToSize();

        System.out.println("Trimmed capacity: " + fruits.capacity());
    }
}
