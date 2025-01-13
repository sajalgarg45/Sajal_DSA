package JAVA03_Searching;
import java.util.Arrays;

/*
Matrix

1   4   7   11
2   5   8   12
3   6   9   16
10  13  14  17

Rows are sorted:

Row 1 → [1, 4, 7, 11]
Row 2 → [2, 5, 8, 12]
Row 3 → [3, 6, 9, 16]
Row 4 → [10, 13, 14, 17]

Columns are sorted:

Column 1 → [1, 2, 3, 10]
Column 2 → [4, 5, 6, 13]
Column 3 → [7, 8, 9, 14]
Column 4 → [11, 12, 16, 17]

here the searching goes from the diagonal or say secondary diagonal
so check the 4 then 7 then 10 then 13

*/

public class JAVA09_BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1 ,  2   ,3,   4},
                {5   ,6  , 7  , 8},
                {9 ,  10 , 11 , 12},
                {13 , 14 , 15 , 16}
        };
        int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix , int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
