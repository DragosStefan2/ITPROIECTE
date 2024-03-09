package Teme;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args) {
        /** 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.*/

        Scanner x = new Scanner(System.in);
        System.out.println("Enter x: ");
        int z = x.nextInt();

        Scanner y = new Scanner(System.in);
        System.out.println("Enter y: ");
        int f = y.nextInt();

        System.out.println("Addition for you numbers is: " + (z + f));
        System.out.println("Subtraction for your numbers is: " + (z - f));
        System.out.println("Multiplication for you numbers is: " + (z * f));
        System.out.println("Division for your numbers is: " + (z / f));
        System.out.println("Modulus for you numbers is " + (z % f));

        /**2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.*/
        int a= 0;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(--a);

        /**3. Write a program to check if a number is positive or negative using logical complement operator.*/
        Scanner scannerNumbers = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int number1 = scannerNumbers.nextInt();
        boolean isPositive = !(number1 < 0);
        if(isPositive){
            System.out.println(number1  + " is positive");
        }else {
            System.out.println(number1 + "is negative");
        }

    }
}
