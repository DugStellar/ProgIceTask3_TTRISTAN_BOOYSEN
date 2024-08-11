package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question16 {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);

        // Create a clone of the original list
        List<Integer> clonedList = new ArrayList<>(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("Cloned list: " + clonedList);
    }
}
