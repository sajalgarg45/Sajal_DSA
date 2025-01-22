package JAVA10_Recursion;

/*
Fibonacci = fib(n-1) + fib(n-2)
- Break it down into smaller problems
- This is known as recurrence relation
The base condition is represented by answers we already have -> Recursive Tree
in this we know that f(0) = 0 , f(1) = 1 -> Bare minimum condition
 */

public class JAVA02_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(4));
    }
    public static int fibonacciNumber(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}

/*
1) identify if you can break the problem into smaller problems
2) write the recurrence relation if needed
3) draw the recursive tree
4) about the tree :-
    see the flow of functions, how they are getting in stack
    identify and focus on LHS tree calls and RHS tree calls , meaning which is going first
    draw the pointers again and again using pen nd paper , use a debugger
5) see how the values are returned at each step , see where the function call is going and coming out

 */