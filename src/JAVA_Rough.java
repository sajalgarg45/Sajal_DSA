import java.util.Scanner;

public class JAVA_Rough {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = evenDigits(a);
        System.out.println(b);
    }
    public static int evenDigits(int n){
        if (n == 0) {
            return 0;
        }
        int lastDigits = n%10;
        if(lastDigits%2==0){
            return evenDigits(n/10)*10+lastDigits;
        }
        else{
            return evenDigits(n/10);
        }
    }
}
