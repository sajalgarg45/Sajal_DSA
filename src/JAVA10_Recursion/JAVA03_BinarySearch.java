package JAVA10_Recursion;

/*
F(n) = O(1) + f(n/2) -> Recurrence Relation
O(1) -> comparison
f(n/2) -> dividing into 2 subArray

- Linear recurrence -> linear search -> slower -> inefficient
    to avoid this false recursion we use Dynamic programming to overcome the repeated function call
- Divide and conquer recurrence relation -> Binary search ->
    search space is divided by a factor -> faster


 */
public class JAVA03_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans=BinarySearch(arr,4, 0, arr.length-1);
        System.out.println(ans);
    }

    public static int BinarySearch(int[] arr,int target, int start, int end) {
        if (start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid; 
        }
        if(target>arr[mid]){
            BinarySearch(arr,target,start,mid-1);
        }
        return BinarySearch(arr,target,mid+1,end);
    }
}
