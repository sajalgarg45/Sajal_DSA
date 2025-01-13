package JAVA00_Assignment;

public class JAVA02_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for (int i = right; i >= left; i--) {
                System.out.println(matrix[bottom][i]);
            }}
            bottom--;
            if(left<=right){
           for (int i = bottom; i >= top; i--) {
               System.out.println(matrix[i][left]);
            }}
            left++;
        }
    }
}
