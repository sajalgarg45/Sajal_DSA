package JAVA05_Sorting;

/*

Merge Sort is Done by Recursion ->
It is a divide and conquer type of recursion
Array = [8,3,4,12,5,6]
Divide it -> [8,3,4] [12,5,6]
Sort each half and after sorting , merge them
After sort we get -> [3,4,8] [5,6,12] -> obtain by divide and conquer
Now merge them, the sorting goes like - compare each element of LHS to RHS
Comparisons - ( 3<5 , 4<5 , 8<5 , 8<6 , 8<12 )
Sorted Array - [3,4,5,6,8,12]
Here the base condition is when only one element remains
*/

import java.util.Arrays;

public class JAVA05_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergeSort(arr);
//        arr = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        /*
        original array is not updated, to update it modify the array
         */
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;  
        }
        int mid = arr.length/2;
        // new array is being created and pass on
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge (int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i=0; // pointer for first array
        int j=0; // pointer for second array
        int k=0; // po
        while(i< first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        // it may be possible , one of the array is not complete
        // copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
