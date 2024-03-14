package Challenges;
import java.util.Random;
import java.util.Scanner;
public class joc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange-minRange +1)+minRange;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess > 100) {
                System.out.println("Please select a number between 1 and 100.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }else if(guess < randomNumber) {
                System.out.println("Too low! Try again.");
            }else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
                break;
            }
        }

        scanner.close();
    }
}