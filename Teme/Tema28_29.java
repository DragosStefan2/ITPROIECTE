package Teme;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Tema28_29 {
        /**-Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year.
Print out each Monday's date.*/
        public static void main(String[] args) {
            LocalDate today = LocalDate.now();
            int nextYear = today.getYear() + 1;
            LocalDate firstDayOfNextYear = LocalDate.of(nextYear, Month.JANUARY, 1);

            List<LocalDate> mondays = new ArrayList<>();

            LocalDate currentDay = firstDayOfNextYear;
            while (currentDay.getYear() == nextYear) {
                if (currentDay.getDayOfWeek() == DayOfWeek.MONDAY) {
                    mondays.add(currentDay);
                }
                currentDay = currentDay.plusDays(1);
            }

            mondays.forEach(System.out::println);
        }
}
