package Teme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Tema14 {
    public static void main(String[] args) {
        /** Add 5 hours and 30 minutes to the current time and print it.*/

        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime dataCurenta5ore = dataCurenta.atStartOfDay().plusHours(5).plusMinutes(30);
        System.out.println("Data curenta este " + dataCurenta5ore.format(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm")));

        /**From a given LocalDateTime, extract the date and time and print them separately.*/

        LocalDateTime datacurenta= LocalDateTime.now();
        System.out.println("Data curenta este: "+ datacurenta.toLocalDate());
        System.out.println("Timpul curent este: "+ datacurenta.toLocalTime());

        /**Generate a random integer between 1 and 100.*/

        Random random = new Random();
        int x= random.nextInt(1,100);
        System.out.println(x);

        /**Choose a random element from the array {"apple", "banana", "cherry", "date"}.*/

        String[] fruits= {"apple", "banana", "cherry", "date"};

        int RandomIndex= random.nextInt(fruits.length);

        String randomelement= fruits[RandomIndex];

        System.out.println("Random element: "+ randomelement);

        /**Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList.*/

        ArrayList<String> elemente= new ArrayList<>();
        elemente.add(0, "meow");
        elemente.add(1, "pisica");
        elemente.add(2,"gheare");
        elemente.add(3, "codita");
        elemente.add(4,"paws");

        System.out.println(elemente.size());


    }
}
