package JAVA01_Basics;
import java.util.Scanner;

public class JAVA06_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Take input from the user till user does not press X or x
        int ans = 0;
        while(true){
            System.out.println("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the num1 : ");
                int num1 = sc.nextInt();
                System.out.println("Enter the num2 : ");
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '/'){
                    ans = num1/num2;
                }
                if(op == '%'){
                    ans = num1%num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
