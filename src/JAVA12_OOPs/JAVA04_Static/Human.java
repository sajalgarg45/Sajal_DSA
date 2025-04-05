package JAVA12_OOPs.JAVA04_Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}

/*
when a member is declared static , it can be accessed before any of the object of the class
being created and without referencing to the object

static variables are not depend on objects , we can use without creating object or
referencing the object, we can declare both methods and variables as static
 */