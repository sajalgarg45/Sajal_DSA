package JAVA00_Assignment;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class JAVA04_Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        displayCalendar(year, month);
        scanner.close();
    }

    private static void displayCalendar(int year, int month) {
        // Get the first day of the month
        LocalDate firstDay = LocalDate.of(year, month, 1);

        // Get the total number of days in the month
        int totalDays = firstDay.lengthOfMonth();

        // Get the day of the week the month starts on (0 for Sunday, 1 for Monday, etc.)
        int startDayValue = firstDay.getDayOfWeek().getValue();
        startDayValue = (startDayValue == 7) ? 0 : startDayValue; // Adjust to start with Sunday as 0

        // Print the header
        System.out.println("\n   " + firstDay.getMonth() + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first row
        for (int i = 0; i < startDayValue; i++) {
            System.out.print("   ");
        }

        // Print the calendar days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%2d ", day);

            // Move to the next line after Saturday
            if ((startDayValue + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Add a newline at the end if needed
        if ((startDayValue + totalDays) % 7 != 0) {
            System.out.println();
        }
    }

}
