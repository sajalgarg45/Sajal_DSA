package JAVA10_Recursion;

/*
Here what is happening in fun and fun2 :

In fun1 -> it is simple . we are just calling the function till 0 by decrementing by 1

In fun2 -> the functions are filling in stack ,like
fun(5) -> fun(4) -> fun(3) -> fun(2) -> fun(1) -> now fun(1) prints 1 -> then 2 -> 3 -> 4 -> 5
 */


public class JAVA04_PrintingNumOrder {
    public static void main(String[] args) {
        fun1(5);
        fun2(5);
        fun3(5);
    }

    static void fun1(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun1(n-1);
    }

    static void fun2(int n){
        if(n==0){
            return ;
        }
        fun2(n-1);
        System.out.println(n);
    }

    static void fun3(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }
}