package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question21 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("South Africa");
        countries.add("United States");
        countries.add("Canada");
        countries.add("Australia");

        System.out.println("Original list: " + countries);

        // Replace the second element (index 1) with "Brazil"
        countries.set(1, "Brazil");

        System.out.println("Modified list: " + countries);
    }
}