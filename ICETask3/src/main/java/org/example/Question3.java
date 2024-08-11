package org.example;
import java.util.ArrayList;
import java.util.List;
public class Question3 {

        public static void main(String[] args) {
            // Create an ArrayList
            List<String> names = new ArrayList<>();

            // Add some colors
            names.add("Liam");
            names.add("Euan");
            names.add("Luxolo");

            // Insert a new name at the first position
            names.add(0, "Anika");

            // Print the updated ArrayList
            System.out.println(names);
        }
    }
