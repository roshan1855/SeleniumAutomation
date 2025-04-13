package TestJava;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        // Creating a Map (Key: String, Value: Integer)
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);
        studentScores.put("Alice", 92); // Overwrites the previous value for "Alice"

        // Accessing elements using keys
        System.out.println("Bob's Score: " + studentScores.get("Bob"));

        // Iterating over the Map
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
