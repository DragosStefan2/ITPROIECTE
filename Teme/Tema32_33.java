package Teme;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tema32_33 {
    /** -Given a list of Person objects with age and city attributes, filter out people younger than 18 or those who live in the city "Metropolis", then return a list of names of the remaining people, sorted in reverse order.
     -Using https://www.w3schools.com/sql/sql_insert.asp, write sql scripts to insert/select/update/delete elements from a table with name Product and fields: name, price, tva. (1 script for every command: insert/select/update/delete)*/
}
class Person {
    private String name;
    private int age;
    private String city;

    // Constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

    class Main3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20, "Gotham"),
                new Person("Bob", 17, "Metropolis"),
                new Person("Charlie", 25, "Star City"),
                new Person("Diana", 30, "Metropolis"),
                new Person("Eve", 22, "Gotham")
        );

        List<String> result = people.stream()
                .filter(p -> p.getAge() >= 18 && !p.getCity().equalsIgnoreCase("Metropolis"))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
