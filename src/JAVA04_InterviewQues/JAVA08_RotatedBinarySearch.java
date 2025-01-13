package JAVA04_InterviewQues;

/*
here the logic goes
1) we go to the search function
2) find the pivot
3) now from the search function access the binary search using pivot , start , end
4) got the values
 */

public class JAVA08_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int result = search(arr, target);
        System.out.println("Index of target: " + result);
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binary_Search(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binary_Search(arr, target, 0, pivot - 1);
        } else {
            return binary_Search(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binary_Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
