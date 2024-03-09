package Teme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tema13 {
    public static void main(String[] args) {
        /**Create a Java program that uses a StringBuilder to concatenate an array of strings. The program should print the final concatenated string. (methods: append())*/
        String [] Prajitura= {"Tiramisu", "Negresa", "Cheese cake"};
        StringBuilder cofetaria=new StringBuilder();
        for (String slay: Prajitura){
            cofetaria.append(slay);
        }
        System.out.println(cofetaria.toString());
        /**Create a class named Student with name and age fields. Write a method to display the details of a student.*/
        Student Dragos= new Student("Dragos", 20);
        System.out.println(Dragos.name+" " +Dragos.age);
        /**Write a program that prints the current date.*/
        LocalDate datacurenta= LocalDate.now();
        System.out.println(datacurenta.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        /**Print the date that will be after 10 days from today.*/
        LocalDate zileinplus= datacurenta.plusDays(10);
        System.out.println(zileinplus.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
