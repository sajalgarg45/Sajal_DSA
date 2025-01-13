package JAVA04_InterviewQues;

/*
In duplicate array we cannot find where is array starting or ending
[2,9,2,2,2]
 S   M   E
we do - new s = s+1 to new end = e-1
*/

public class JAVA09_RBS_DupValues {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 6, 7, 0, 1, 6};
        int target = 7;
        int result = search(arr, target);
        System.out.println("Index of target: " + result);
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);
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

    static int findPivotWithDuplicates(int[] arr) {
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

            // if s.m.e are same then just skip the duplicates
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                //skip the duplicates

                // check if start is pivot or not ?
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                // check if end is pivot or not ?
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid])){
                start = mid+1;}
            else{
                    end = mid - 1;
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
