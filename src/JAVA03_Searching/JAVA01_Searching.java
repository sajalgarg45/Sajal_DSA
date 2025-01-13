package JAVA03_Searching;

public class JAVA01_Searching {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int target = 3;
        int a = search(arr, target);
        System.out.println(a);
    }
    static int search(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
