package JAVA05_Sorting;

import java.util.Arrays;

/*

In case of quick sort - there is a pivot
choose any element as a pivot
after first Pass ->
all the elements < pivot - (will be at LHS of pivot)
all the elements > pivot - (will be at RHS of pivot)
so what the pivot is doing -> it is placing himself at correct position
Ex - {5,4,3,2,1} , let the pivot = 4
after first pass array be like - {3,2,1,4,5}
Now the 4 is placed perfectly at its respective place

in merge sort the recursion will go till the base condition weather it already sorted or not
but in case of quick sort , it will go till it sorted

How to pick pivot , random element or choose the corner elements or choose the middle
 */

public class JAVA07_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1); 
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
