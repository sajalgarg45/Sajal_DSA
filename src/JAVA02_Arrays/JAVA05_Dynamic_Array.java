package JAVA02_Arrays;

public class JAVA05_Dynamic_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {2,3},
                {5,6,7}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
