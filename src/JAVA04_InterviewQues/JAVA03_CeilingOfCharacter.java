package JAVA04_InterviewQues;

public class JAVA03_CeilingOfCharacter {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18}; // sorted
        int target = 4;
        int ans = ceilingOfNumber(arr,target);
        System.out.println(arr[ans]);
    }
    static int ceilingOfNumber(int[] arr , int target){
        int start  = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
        }
        return start; // here while loop breaks and the [ start = end + 1 ]
    }
}
