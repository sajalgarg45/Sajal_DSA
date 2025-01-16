package JAVA05_Sorting;

/*

CYCLE SORT -
Imp - When given no. rage from 1-N -> use Cyclic Sort
Exam. = 3 5 2 1 4
Index = 0 1 2 3 4
after sorting -> index = value - 1
here what we do is ->

we start's at index 0 and see what element is present , in our case 3 is present to we
swap the elements to its respective index
now our array looks - 2 5 3 1 4
we are still at index 0 now again swap with it respective index

*/

import java.util.Arrays;

public class JAVA04_CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void CyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
