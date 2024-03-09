package Teme;

import java.sql.SQLOutput;

public class Tema9 {
    public static void main(String[] args) {
        /**Create a program that defines a string variable with a value of "Hello". Use nested if statements to first check if the length of the string is greater than 5. If it is not, check if the string equals "Hello" and print the appropriate message in each case.*/
        String buna = "Hello";
        if (buna.length() > 5) {
            System.out.println("Lungimea e mai mare decat 5.");
        } else if (buna.length() < 5) {
            System.out.println("Lungimea e mai mica decat 5.");
        } else {
            System.out.println("Lungimea este egal cu 5.");
        }
        /**Create a Java program where you define a char variable with a value of 'A'. Use a switch statement to print a message for the values 'A', 'B', and 'C'. For 'A', print "Excellent"; for 'B', print "Good"; for 'C', print "Average".*/
        char caracter = 'A';
        System.out.println("The grade is: ");
        switch (caracter) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Failed");
                break;
        }
        /**Create a program that defines a string variable with a value of "Winter". Use a switch statement to print a message for each season ("Winter", "Spring", "Summer", "Autumn"). For "Winter", print "It's cold"; for "Spring", print "Flowers bloom"; for "Summer", print "It's hot"; for "Autumn", print "Leaves fall"*/
        String iarna = "Winter";
        switch (iarna) {
            case "Winter":
                System.out.println("It's cold");
                break;
            case "Spring":
                System.out.println("Flowers bloom.");
                break;
            case "Summer":
                System.out.println("It's hot.");
                break;
            case "Autumn":
                System.out.println("Leaves fall.");
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }
}

