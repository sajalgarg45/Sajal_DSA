package JAVA01_Basics;
import java.util.Scanner;

public class JAVA01_Introduction {
    public static void main(String[] args){
        System.out.println("Hey Bro");
        Scanner input = new Scanner(System.in); // System.in is the keyboard
        System.out.println(input.nextInt());
    }
}

// Public - access from anywhere
// class - name properties of functions
// Main - name of the file and class
// main - function name - reserved keyword - java goes to the main function first
/*
static - no need to create an object to call the function because java starts from the main function
and to call a function we need object , to call a function without creating an object of class Main
we use static that's why main function is static
*/
// void - return type - nothing is returned
// String[] args - arguments - array of strings - command line arguments