package JAVA03_Searching;
import java.util.Arrays;

public class JAVA04_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4,5},
                {6,7},
                {11,12,13,14}
        };

        int target = 13;
        int[] ans = search(arr,target); // return value is an array
        System.out.println(Arrays.toString(ans));

        int a = max(arr);
        System.out.println("The max value is " + a);
        // or
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr , int target){
        for(int row = 0; row <arr.length; row ++){
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row <arr.length; row ++){
            for (int col = 0; col < arr[row].length; col++) {
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
