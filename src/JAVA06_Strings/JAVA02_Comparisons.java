package JAVA06_Strings;

/*

Comparisons of Strings -
A) == method
it checks the reference of the object , not the value

1> without new ()
a---> "Sajal"  -| it will
b---^          -| give true

This checks reference equality (whether a and b point to the same memory location).
Since both a and b point to the same string in the pool, a == b evaluates to true.

2> with new
a---> "Sajal"  -| it will
b---> "Sajal"  -| give false

In this the "Sajal" is outside of string pool and inside of heap
Since name1 and name2 point to two different objects in the heap, name1 == name2 evaluates to false.

B) Using .equals()
when you only needs to check value use .equals method
Since in both the methods of == , the value is same it returns true
*/

public class JAVA02_Comparisons {
    public static void main(String[] args) {
        // without new
        String a = "Sajal";
        String b = "Sajal";
        // Proof
        System.out.println(a==b); // it gives true
        System.out.println(a.equals(b)); // value of a and b is same so true

        String name1 = new String("John Doe");
        String name2 = new String("John Doe");
        // Proof
        System.out.println(name1==name2); // it gives false
        System.out.println(name1.equals(name2)); // value of name1 and name2 is same so true
    }
}
