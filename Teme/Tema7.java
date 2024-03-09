package Teme;

public class Tema7 {
    public static void main(String[] args) {
        /**Create a Java program where you define an integer variable with a value of 5. Use an if statement to check if the number is greater than 10. If it is, print "The number is greater than 10"; otherwise, print "The number is not greater than 10".*/
        int x=5;
        if(x>10){
            System.out.println("The number is greater than 10");
        }else{
            System.out.println("The number is not greater than 10.");
        }
        /**Create a program that defines a string variable with a value of "Hello". Use nested if statements to first check if the length of the string is greater than 5. If it is not, check if the string equals "Hello" and print the appropriate message in each case.*/
        String buna= "Hello";
        if(buna.length()>5){
            System.out.println("Lungimea e mai mare decat 5.");
        }else if(buna.length()<5){
            System.out.println("Lungimea e mai mica decat 5.");
        }else{
            System.out.println("Lungimea este egal cu 5.");
        }
        /**Create a Java program where you define an integer variable with a value of 75. Use an if-else-if ladder to check the range in which the number falls. Use the ranges 0-50, 51-100, and 101-150, and print a message for each range specifying which range the number falls into.*/
        int y=75;
        if(y>=0 && y<=50){
            System.out.println("Y is between 0 and 50");
        } else if(y>=51 && y<=100){
            System.out.println("Y is between 51 and 100");
        } else if(y>=101 && y<=150){
            System.out.println("Y is between 101 and 150");
        } else{
            System.out.println("Y is not between every range.");
        }
    }
}
