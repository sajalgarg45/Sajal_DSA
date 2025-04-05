package JAVA12_OOPs;

/*
Class -> Logical Construct
Object -> Physical reality
Objects are stored in the heap memory , reference variable will stored in stack memory
new keyword is used to create objects
Dot operator -> used by instances to access the class datatypes and functions
When the object is not initialised the default value in java is null
new operator allocated the memory in runtime and returns a reference to it

I can declare the instance of other class to another class , but the function should be called ,
otherwise the memory will not be allocated

How to initialise the instance -
Student S1 = new Student();
    |               |
CompileTime      RunTime

 */


class Car1 {
    // Variables (fields)
    String brand;
    int speed;

    // Void method (no return type)
    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method with int return type
    int getSpeed() {
        return speed;
    }
}


public class JAVA01_Class {
    public static void main(String[] args) {
        // Create an object
        Car1 myCar = new Car1();

        // Assign values to object variables
        myCar.brand = "Toyota";
        myCar.speed = 120;

        // Call methods
        myCar.showDetails();
        System.out.println("Current Speed: " + myCar.getSpeed() + " km/h");
    }
}


