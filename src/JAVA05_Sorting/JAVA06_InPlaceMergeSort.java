package JAVA05_Sorting;
/*
in this instead of creating multiple sub arrays and multiple sub recursive calls
we shall pass the start, end  variables
 */

import java.util.Arrays;

public class JAVA06_InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0, arr.length  );
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if((e-s)==1){
            return ;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s ,mid) ;
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace (int[] arr, int s, int mid , int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while(i < mid && j < e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

}
