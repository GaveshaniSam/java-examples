package list;

import java.util.*;
import java.util.stream.Collectors;

public class NameCounter {
    public static void main(String[] args) {
        // Create a list with duplicate names
        List<String> names = Arrays.asList("gaveshani", "nethma", "nethma", "gaveshani", "nethma",
                "sachin", "gaveshani", "sachin", "sachin", "nethma");

        // Use Stream to count occurrences of each name
        names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting())) // Group names and count occurrences
                .forEach((name, count) -> System.out.println(name + "(" + count + ")")); // Print in required format
    }
}
