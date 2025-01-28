package JAVA10_Recursion;

import java.util.Arrays;

/*
it is similarly like the pattern we did previous
****
***
**
*
similarly every star is like the iteration to be done for bubble sort
 */
public class JAVA12_BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // Swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }
}
