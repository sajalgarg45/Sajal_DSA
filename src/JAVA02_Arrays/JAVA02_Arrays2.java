package JAVA02_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class JAVA02_Arrays2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) { // Old For Loop
            arr[i] = in.nextInt();
        }

        for(int num:arr){
            System.out.print(num + " "); // New For Loop
        }
        System.out.println();
        System.out.println(Arrays.toString(arr)); // Another way to print an array by converting into string

    }
}
