package JAVA02a_ArraysQuestions;

import java.util.Arrays;

public class JAVA02_RotateKPlace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // number of times to rotate
        k = k% arr.length;
        for (int r = 0; r < k; r++) {
            int temp = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }

}
