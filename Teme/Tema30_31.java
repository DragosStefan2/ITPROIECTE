package Teme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tema30_31 {
    /**-For a list of strings, create a method that filters out strings with fewer than 5 characters,
     then converts each string to uppercase, and finally sorts them in reverse order.*/
    public static List<String> processStrings(List<String> input) {
        return input.stream()
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("pear");
        strings.add("grape");
        strings.add("kiwi");
        strings.add("pineapple");
        strings.add("mango");

        List<String> processedStrings = processStrings(strings);
        processedStrings.forEach(System.out::println);
    }
}
