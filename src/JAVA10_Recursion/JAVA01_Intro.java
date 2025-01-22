package JAVA10_Recursion;

/*
 
RECURSION -> A function which call itself
All the function calls in Java goes to stack memory
while the function is not finished calling , it will remain in the stack Memory
when a function finishes executing it is removed from the stack amd the flow of program is restored
to where that function was called .
Base condition -> it is a condition where we have to stop the recursive function
every time we call the function , the function takes the memory separately
without base function the stack is filled by memory till memory exceeds (Infinte loop) -> stack overflow error
space complexity is not constant because of recursive calls .

 */

public class JAVA01_Intro {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){

        // Base condition
        if(n==5){
            System.out.println(5);
            return ;
        }

        System.out.println(n);
        number(n+1);
    }
}
