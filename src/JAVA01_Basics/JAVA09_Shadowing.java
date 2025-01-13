package JAVA01_Basics;

public class JAVA09_Shadowing {
    static int a = 78;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 40;  // scope will begin when we initialise the value
        fun(); // this doesn't print 40 because the fun function access a from outside of main scope
        System.out.println(a); // it prints a = 40 as the value is re define inside the scope
    }
    static void fun(){
        System.out.println(a);
    }
}

/*
Key Takeaway -
A static method can only directly access other static members (variables or methods) of the class.
You use static for a in your code so that it can be directly accessed within the static main method
without needing to create an object of the class.
 */


// VARARGS - variable arguments

//public class JAVA09_Shadowing {
//    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 7); // Calls 'fun' with variable arguments
//        multiple(1, "Hello", 2, "World", "Java", "Programming");
//    }
//
//    static void fun(int... v) {  // 'v' is a variable-length argument (array of integers)
//        System.out.println(Arrays.toString(v));
//    }
//
//    static void multiple(int a, String b, int c, String... d) {
//        System.out.println("a: " + a);     // Print the first int
//        System.out.println("b: " + b);     // Print the first string
//        System.out.println("c: " + c);     // Print the second int
//        System.out.println("d: " + Arrays.toString(d)); // Print the variable-length string array
//    }
//}
