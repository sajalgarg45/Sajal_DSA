package JAVA02a_ArraysQuestions;

import java.util.Arrays;

public class JAVA01_RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,3,1,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i]==arr[i+1]) && (i==0 || arr[i]!=arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }

}

