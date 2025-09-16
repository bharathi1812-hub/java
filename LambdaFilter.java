package day3;

import java.util.*;

public class LambdaFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "ant", "banana", "cat");

        // Keep only words starting with 'a'
        List<String> result = words.stream()
                                   .filter(w -> w.startsWith("a"))
                                   .toList();

        result.forEach(System.out::println);
    }
}

