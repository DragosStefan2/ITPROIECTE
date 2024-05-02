package Cursuri;

import java.util.Scanner;

public class Exercitii9 {
    public static void main(String[] args) {
        for (int number = 1; number < 11; number++) {
            System.out.println(number);
        }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti numarul: ");
            int n = scanner.nextInt();
            int counterI = 0;
            int counterP = 0;
            for (int numar = 1; numar <= n; numar++) {
                if (numar % 2 == 0) {
                    ++counterP;

                } else {
                    ++counterI;

                }
            }
        System.out.println("Counter impar: " + counterI);
        System.out.println("Counter par: " + counterP);


        int y = 5;
        if (y > 10) {
            System.out.println("Numarul e mai decat 10");
        } else {
            System.out.println("Numarul este mai mic decat 10");
        }
    }
}
