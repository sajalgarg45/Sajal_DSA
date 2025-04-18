package JAVA04_InterviewQues;

public class JAVA10_RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int pivot = findPivot(arr);
        System.out.println(pivot+1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]> arr[mid+1]){ // mid<end it ensures array don't go out of bounds
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
