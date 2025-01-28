package JAVA10_Recursion;

import java.util.ArrayList;

public class JAVA09_DuplicateIndexReturn {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,6,7,8,9};
        System.out.println(findAllIndex(arr,2,0,new ArrayList<>()));
    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target, index+1,list);
    }
}
