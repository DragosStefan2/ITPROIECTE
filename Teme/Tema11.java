package Teme;

import java.util.Scanner;

public class Tema11 {
    public static void main(String[] args) {

        /**Create a Java program where you define an integer variable with a value between 1 and 7.
         * Use a switch statement to print the name of the corresponding day of the week.
         * For example, if the variable has a value of 1, it should print "Monday".*/
        int dayoftheweek = 2;
        switch (dayoftheweek) {
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            case 6:
                System.out.println("Saturday.");
                break;
            case 7:
                System.out.println("Sunday.");
                break;
            default:
                System.out.println("Nu este zi.");
                break;
        }
            /**Create a Java program that uses a while loop to find the sum of numbers from 1 to n, where n is a positive integer entered by the user.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number:");

        int n = input.nextInt();

        int total = 0;

        int i = 1;

        while (i <= n) {

            total = total + i;

            i = i + 1;
        }

        System.out.println("Result: " + total);
        /**Create a Java program that uses a do-while loop to print numbers from 10 to 1 in descending order.*/
        int d=10;
        do {
            System.out.println(d--);
        }while (d>=1);
        /**Create a Java program that uses a for loop to print even numbers from 2 to 20.*/
        for(int j=2; j<=20; j++){
            System.out.println(j);
        }
    }
}
