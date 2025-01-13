package JAVA06_Strings;

/*
Strings is the class of JAVA

String name = "John";
here string is data type
name is reference variable
"John" is an object

String Pool -
Heap makes our program more optimised
we cannot change the object because strings are immutable [Because of Security Reasons]
to change the name from "john" to "john doe" , we have to create a new object
Pros - if two object pointing to same object in string pool ,
in arrays or others , we change from one reference variable the other one is also changed
but strings are immutable so it cannot be done in strings , so to do this we create a new object
 */

public class JAVA01_Strings {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,19};
        String name = "Sajal Garg";

        // here a and b is pointing to same object
        String a = "Sajal";
        System.out.println(a);
        a = "Garg";
        System.out.println(a);
/*
    here see what is happening -
    firstly there is a string pool in heap where object stores and the reference variable is in stack

    a---> "Sajal" - Here a is pointing to "Sajal"
    then
    a---> "Garg" - Now a is pointing towards "Garg"

    so it concludes the object a to sajal is destroyed and a new object a to garg is created
    what happens to sajal then ? -> it will be handled by garbage collection

 */

    }
}
