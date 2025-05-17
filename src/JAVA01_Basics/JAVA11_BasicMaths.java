package JAVA01_Basics;

public class JAVA11_BasicMaths {

    public static void main(String[] args) {

        countNum(7789);
        revNum(778900);
        System.out.println(palindrome(121));
        System.out.println(armstrong(370));
        divisors(36);;
        prime(29);
    }

    // Sum of Digits
    public static void countNum(int a){
        int count = 0;
        while(a>0){
            int l = a%10;
            a = a/10;
            count++;
        }
        System.out.println(count);
    }

    // Reverse the Number
    public static void revNum(int a){
        int rev = 0;
        while(a>0){
            int last = a%10;
            a = a/10;
            rev = (rev*10)+last;
        }
    }

    // Palindrome Number
    public static boolean palindrome(int a) {
        int z = a;
        int rev = 0;
        while (a > 0) {
            int last = a % 10;
            a = a / 10;
            rev = (rev * 10) + last;
        }
        return z == rev;
    }

    // Armstrong Number
    public static boolean armstrong(int a) {
        int z = a;
        int sum = 0;
        while (a > 0) {
            int l = a % 10;
            a = a / 10;
            sum = sum + (l*l*l);
        }
        return z == sum;
    }

    // Print all the divisors
    public static void divisors(int a){
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // Prime Number
    public static void prime(int a){
        boolean flag = true;
        System.out.println();
        for (int i = 2; i <= a/2 ; i++) {
            if(a%i==0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

}
