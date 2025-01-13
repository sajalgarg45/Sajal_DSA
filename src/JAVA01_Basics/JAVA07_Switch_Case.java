package JAVA01_Basics;
import java.util.Scanner;
public class JAVA07_Switch_Case{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the day number
        System.out.print("Enter a number (1-7) to find the day of the week: ");
        int dayNumber = in.nextInt();

        // Determine the day using switch case
        String day = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid number! Please enter a number between 1 and 7.";
        };

        // Output the result
        System.out.println("Day: " + day);
    }
}
