package JAVA05_Sorting;

import java.util.Arrays;

public class JAVA02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            // find the max element and push it to the end of the array
            int last = arr.length-i-1; // here last refers to the index of the last element
            int maxIndex = getMaxIndex(arr,0,last);
            swapArray(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr , int start ,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swapArray(int[] arr , int first , int second){
        /*
        here we are swapping the last index which we get from last variable
        and getMaxIndex , where we get the max element index ,
        so we can swap the last index element to the max index element to sort the list
         */
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
