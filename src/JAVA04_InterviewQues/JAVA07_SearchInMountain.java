package JAVA04_InterviewQues;

public class JAVA07_SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnostic(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing order this means mid is answer or before of mid is the answer
                end = mid;
            } else {
                // you are in ascemding part of array
                // or before mid elements the highest value is present
                start = mid + 1;
            }
        }
        return start; // or end because both are equal
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2; // safer way
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
// {1,2,6,3,4,3}