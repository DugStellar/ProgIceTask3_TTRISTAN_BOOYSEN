package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");

        List<String> targetList = new ArrayList<>();
        targetList.addAll(sourceList);

        System.out.println("Target List: " + targetList);
    }
}
