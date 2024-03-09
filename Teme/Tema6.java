package Teme;

import java.util.Scanner;

public class Tema6 {
    public static void main(String[] args) {
        /**4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.*/
        for(int i=1 ; i<=10; i++){
            System.out.println(i+ " ");
        }
        for(int j=10 ; j>=1; j--){
            System.out.println(j+ " ");
        }
        /**5. Create a Java program that demonstrates the use of each compound assignment operator with integers.*/
        int x= 2;
        int y= 3;
        x += y; //2+3 = 5
        System.out.println("after +=:" + x);
        x -= y; // 5-3=2
        System.out.println("after -=:" + x);
        x = y;  // declaram variabila noua x= 3
        System.out.println("after=:" + x);
        x /= y; //3/3=1
        System.out.println("after /=:" + x);
        x %= y; // 1 % 3= 1
        System.out.println("after %=:" + x);

        /**6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a= scanner.nextInt();

        Scanner boss= new Scanner(System.in);
        System.out.println("Enter b: ");
        int b= boss.nextInt();

        if(a>b){
            System.out.println("a is greater than b.");
        } else if(a<b){
            System.out.println("a is less than b.");
        } else{
            System.out.println("a is equal b.");
        }

        /**7. Write a program where you perform operations between an integer and a double. Display the result.*/
        int c= 20;
        double d= 20.3;
        System.out.println(c+d); //Intellij converteaza c-ul automat la variabila mai implicita, respectiv double.
        System.out.println(d-c);
        System.out.println(d/c);
    }
}
