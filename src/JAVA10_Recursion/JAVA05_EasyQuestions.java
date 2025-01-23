package JAVA10_Recursion;

public class JAVA05_EasyQuestions {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfDigits(234));
        System.out.println(reverseNum(1234));
    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sumOfDigits(int n){
        if(n<=9){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }

    static int rev = 0;
    public static int reverseNum(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        rev = rev * 10 + rem;
        reverseNum(n/10);
        return rev;
    }
}
