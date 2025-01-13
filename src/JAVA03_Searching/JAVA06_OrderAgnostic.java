package JAVA03_Searching;

public class JAVA06_OrderAgnostic {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9}; // sorted
        int target = 7;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr , int target){
        int start  = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid  = start+(end-start)/2; // safer way
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;}
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;}
            }
        }
        return -1;
    }
}