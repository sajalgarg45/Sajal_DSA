package JAVA02_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class JAVA04_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; // 2D ARRAY - Array of Arrays . each index has its own array
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // 2D Array Lifecycle

        // Initialising a 2D Array
        int[][] arr3 = new int[3][3];
        System.out.println(arr3.length); // it prints the number of rows

        // Giving Inputs to the Array
        for (int row = 0; row < arr.length; row++) {
            // represents the length of the array present in the row
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Enter the element "+arr[row][column]+" ; ");
                arr[row][column] = sc.nextInt();
            }
        }

        // Printing The 2D Array
        System.out.println("The printed Array is - ");
        for (int row = 0; row < arr.length; row++) {
            // represents the length of the array present in the row
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
            }
            System.out.println();
        }
        /*
        Enhanced For Loop -
        Use it when you just need to access each element in a collection or array without
        modifying the structure or requiring the index.
        */
        System.out.println("The printed Array is - ");
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
