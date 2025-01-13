package JAVA01_Basics;
import java.util.Scanner;
// Print Sum of Two Numbers


public class JAVA08_Functions {
    public static void main(String[] args) {

        sum();
        greet(); // return type doesn't print anything
        String ant = greet();
        System.out.println(ant);

        sum3(3,4);

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = in.nextInt();
        System.out.println("Enter the number");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is " + sum);
    }

    static String greet(){
        String Sajal = "hello";
        return Sajal;
    }

    static int sum3(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return 0;
    }

}

// In java there is no pass by reference , only pass by value
/*
Key Takeaways
Primitives: Pass-by-value copies the value; no change to the original.
Strings: Pass-by-value copies the reference, but strings are immutable, so changes do not reflect.
Objects (like arrays): Pass-by-value copies the reference, allowing modification of the object's
contents since both references point to the same object in memory.
 */

