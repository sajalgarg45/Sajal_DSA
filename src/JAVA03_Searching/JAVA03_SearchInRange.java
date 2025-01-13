package JAVA03_Searching;

public class JAVA03_SearchInRange {
    public static void main(String[] args) {
        int arr[] = {10,2,5,6,3,4};
        int target = 3;
        int a = search(arr, target , 0 , 2); // if not found return -1
        int b = min(arr);
        System.out.println(a);
        System.out.println(b);
    }
    static int search(int[] arr , int target, int start , int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<=ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
