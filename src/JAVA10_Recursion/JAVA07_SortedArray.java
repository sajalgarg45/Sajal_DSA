package JAVA10_Recursion;

public class JAVA07_SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7};
        System.out.println(sortedCheck(arr,0));
    }

    public static boolean sortedCheck(int[] arr, int index ){
            // base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedCheck(arr,index+1);
    }

}
