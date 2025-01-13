package JAVA01_Basics;
import java.util.Scanner;

public class JAVA03_Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        int num2 = sc.nextInt();
//        System.out.println(num);

        // Asking for float and giving int is acceptable but vice versa not
        // Typecasting
        int num = (int)(67.50f); // converts the float into integer , prints 67
        System.out.println(num);

        // Automatic Type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // here byte gives the remainder as it limits to 256

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        int d = (b1*b2)/b3; // here it treats the variable like int as we are storing into int
        System.out.println(d);

        int number = 'A'; // automatic type conversion the character is converted to number
        System.out.println(number);

        byte bb = 42;
        char cc = 'a';
        short ss = 1024;
        int ii = 50000;
        float ff = 5.67f;
        double dd = 0.12345;
        double result = (ff*bb)+(ii/cc)-(dd-ss); // resultant converts ito bigger data type
        // float + int - double = double
        System.out.println((ff*bb)+" "+(ii/cc)+" "+(dd-ss));
        System.out.println(result);
    }
}

// Celsius to Fahrenheit Convertor

//public class JAVA03_Typecasting {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float result = (a*9/5)+32;
////        float result = (a * ((float)9 / 5)) + 32;
//        System.out.println(result);
//
//    }
//}



