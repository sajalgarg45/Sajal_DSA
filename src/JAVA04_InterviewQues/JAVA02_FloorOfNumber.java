package JAVA04_InterviewQues;
// Floor of the array -> Greatest element in array smaller or equal to the target element

public class JAVA02_FloorOfNumber {
        public static void main(String[] args) {
            int arr[] = {2,3,5,9,14,16,18}; // sorted
            int target = 15; // 14 is the answer
            int ans = floorOfNumber(arr,target);
            System.out.println(arr[ans]);
        }
        static int floorOfNumber(int[] arr , int target){
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
            return end; // here while loop breaks and it returns end to get the floor
        }
    }