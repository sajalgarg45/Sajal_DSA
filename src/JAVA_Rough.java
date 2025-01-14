import java.util.ArrayList;
import java.util.Scanner;

public class JAVA_Rough {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactor(n,2);
    }
    public static void primeFactor(int n, int divisor){
        if(n==1){
            return;
        }
        else if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactor(n / divisor, divisor);
        } else {
            primeFactor(n, divisor + 1);
        }
    }
}