package Cursuri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Challenge13 {
    public static void main(String[] args) {
        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime dataCurenta5ore = dataCurenta.atStartOfDay().plusHours(5).plusMinutes(30);
        System.out.println("Data curenta este " + dataCurenta5ore);

        LocalDateTime dataexactfancy = LocalDateTime.now();
        LocalDate nume = dataexactfancy.toLocalDate();
        LocalTime altnume = dataexactfancy.toLocalTime();
        System.out.println("Am extras data: " + nume);
        System.out.println("Am extras timpul: " + altnume);

        LocalDateTime meow = LocalDateTime.of(2024, 03, 30, 10, 20, 54, 1000);
        System.out.println(meow.isBefore(dataexactfancy));

        System.out.println(dataexactfancy.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

        Random numereRandom = new Random();
        System.out.println(numereRandom.nextInt(1, 300));
    }
}
