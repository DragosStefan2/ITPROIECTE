package Teme;

public class Tema12 {
    public static void main(String[] args) {
        /**Create a Java program to find and print the length of a given string.*/
        String biscuit= "Oreo";
        System.out.println(biscuit.length());
        /**Create a Java program that finds and prints the character at a given index(2) in a string.*/
        System.out.println(biscuit.charAt(2));
        /**Create a Java program that finds and prints the index of the first occurrence of a character in a string.*/
        char prima= biscuit.charAt(0);
        int index= biscuit.indexOf(prima);
        if (index!=-1){
            System.out.println(index);
        }else{
            System.out.println("Eroare.");
        }
        /**Create a Java program that prints a substring of a given string from a specified start index(1) to end index(3).*/
        StringBuilder prajitura= new StringBuilder("Tiramisu");
        String meow= prajitura.substring(1, 3);
        System.out.println(meow);
        /**Create a Java program that converts a given string to uppercase and lowercase and prints both outputs.*/
        String cofetarie= "Sofia";
        System.out.println(cofetarie.toUpperCase()+ " "+  cofetarie.toLowerCase());
    }
}
