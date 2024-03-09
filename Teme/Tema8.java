package Teme;

import java.util.Scanner;

public class Tema8 {
    public static void main(String[] args) {
        /**Create a simple program that takes a number as input and uses if-else statements to categorize the number as "positive," "negative," or "zero."*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
        /**Create a program that takes a number as input and uses if statement to print whether the number is "positive" or "non-positive".*/

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number: ");
        double numar = scanner.nextDouble();

        if (numar > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }
        /**Create a program that takes three numbers as input and print the largest number among them.*/
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int numar1 = scanner.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter number2: ");
        int numar2 = scanner.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter number3: ");
        int numar3 = scanner.nextInt();

        int largest = numar1;

        if (numar2 > largest) {
            largest = numar2;
        }

        if (numar3 > largest) {
            largest = numar3;
        }

        System.out.println("The largest number is: " + largest);

        /**Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:

         If both hasUsername and hasPassword are true, print "Authentication successful".
         If either hasUsername or hasPassword is false, print "Authentication failed".
         If hasUsername is true but hasPassword is false, print "Password is incorrect".*/

        boolean hasUsername=true;
        boolean hasPassword=false;
         if(hasUsername==hasPassword){
             System.out.println("Authentication successful");
         } else if(hasUsername==false && hasPassword==false){
             System.out.println("Authentication failed.");
         } else if(hasUsername==true && hasPassword==false){
             System.out.println("Password is incorrect.");
         }else{
             System.out.println("Error authentication");
         }
         }
}
