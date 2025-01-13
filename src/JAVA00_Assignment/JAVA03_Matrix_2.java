package JAVA00_Assignment;
import java.util.Scanner;

public class JAVA03_Matrix_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int n = sc.nextInt();

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int[][] ans = new int[n][n];
        int inc =1;

        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                ans[top][i] = inc;
                inc++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = inc;
                inc++;
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--) {
                ans[bottom][i] = inc;
                inc++;
                }}
            bottom--;
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                ans[i][left] = inc;
                inc++;
                }}
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(ans[i][j]);
            }
        }

    }
}
