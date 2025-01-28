package JAVA10_Recursion;

public class JAVA08_Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(find(arr,3,0));
    }
    public static boolean find(int[] arr,int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}
