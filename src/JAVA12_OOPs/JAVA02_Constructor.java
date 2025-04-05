package JAVA12_OOPs;

//constructor is a special function that runs when you create an object, it allocates some variables
//bind these arguments with the object

public class JAVA02_Constructor {
    public static void main(String[] args) {

        // Creating an Object
        Student1 S1 = new Student1(12,"sajal",12.12f); // Parameterised Constructor
//        Student1 S1 = new Student1();     // Default Constructor

        // Allocating the values
//        S1.rollNo = 11;
//        S1.Name = "John";
//        S1.marks = 88.5f;

        System.out.println(S1.rollNo);
        System.out.println(S1.Name);
        System.out.println(S1.marks);

        S1.changeName("Sajal");
        S1.greeting();

        /*
         But instead of this allocating the value then calling each of them .
         we create a constructor and whenever we create an object it automatically calls

         here in Student1 , we created the variables and a constructor and assign the value to it
         then in main class we created the object and printed the values
         now the constructor automatically calls and prints the values
        */


    }
}

class Student1{
    int rollNo ;
    String Name ;
    float marks ;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object ,the reference variable
    // that keyword is "this" keyword

    void greeting(){
        System.out.println("My name is "+ Name);
    }
    void changeName(String newName){
        Name = newName;
        System.out.println("My name is "+ Name);
    }

    // Created a constructor

    // Default Constructor
    Student1(){
        this.rollNo = 11;       // here this is taking place of S1 -> S1.rollNo
        this.Name = "John";
        this.marks = 88.5f;
    }

    // Parameterised Constructor
    Student1(int roll, String Name, float mark){
        rollNo = roll; // No need to use this keyword here
        this.Name = Name; // if there is same variable name and passing variable name use this keyword
        this.marks = mark; // instead of marks I am passing mark -> but it doesn't matter
    } // here this.Name = Name -> it is best practise

}

/*
there are some more functions like final keyword , wrapper classes , finalisation
these are not important, study when required .

In java we cannot delete the object , it automatically deletes the object when he thinks it's right time
so we tell java some things which he has to do while deleting the object via garbage collection
it is like destructor , but it works automatically
 */
