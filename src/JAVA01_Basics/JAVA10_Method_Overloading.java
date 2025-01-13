package JAVA01_Basics;

public class JAVA10_Method_Overloading {
    // Method with one parameter
    static void display(String name) {

        System.out.println("Hello, " + name);
    }

    // Overloaded method with two parameters
    static void display(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        // Call the method with one parameter
        display("Alice");

        // Call the overloaded method with two parameters
        display("Bob", 25);
    }
}
