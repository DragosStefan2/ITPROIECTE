package Teme;

public class Tema24_25 {
    /**-Create a method that takes a Day enum as a parameter and uses a switch case statement to print a message depending on the day input.*/
    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Second day of the work week!");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day!");
                break;
            case THURSDAY:
                System.out.println("Almost the end of the work week!");
                break;
            case FRIDAY:
                System.out.println("Last work day of the week!");
                break;
            case SATURDAY:
                System.out.println("Weekend has started!");
                break;
            case SUNDAY:
                System.out.println("Enjoy your rest day!");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }

    public static void main(String[] args) {
        // Example usage
        printDayMessage(Day.MONDAY);
        printDayMessage(Day.FRIDAY);
        printDayMessage(Day.SUNDAY);
    }
}
