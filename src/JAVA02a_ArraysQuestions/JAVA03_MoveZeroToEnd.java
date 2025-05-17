package JAVA02a_ArraysQuestions;

import java.util.Arrays;

public class JAVA03_MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};
        int index = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
