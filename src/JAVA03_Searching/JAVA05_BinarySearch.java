package JAVA03_Searching;

public class JAVA05_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7}; // sorted
        int target = 4;
        int ans = binary_Search(arr,target);
        System.out.println(ans);
    }
    static int binary_Search(int[] arr , int target){
        int start  = 0;
        int end = arr.length-1;
        while(start<=end){
            // find the middle element
//            int mid = (start+end)/2; // might be possible (start+end) exceeds the range in java
            int mid  = start+(end-start)/2; // safer way
            if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}