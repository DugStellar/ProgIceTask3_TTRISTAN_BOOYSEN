package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        List<Integer>
        list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);


        // Comparing for equality of contents and order
        boolean isEqual = list1.equals(list2);
        System.out.println("Lists are equal: " + isEqual);
    }
}