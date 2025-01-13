package JAVA01_Basics;
import java.util.Scanner;

public class JAVA02_Data_Types {
    public static void main(String[] args) {

        int roll_no = 10;
        char name = 'S';
        float marks = 13.23f; // to store we need float otherwise double
        double LDN = 4545.45454545; // by default
        long l = 134123414L;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        int roll = input.nextInt();
        System.out.println("Your roll no. is " + roll);
    }
}

// Sum of Two numbers

/*
public class JAVA02_Data_Types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is "+ sum);
    }
}
*/
