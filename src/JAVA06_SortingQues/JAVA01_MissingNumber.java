package JAVA06_SortingQues;
import java.util.Arrays;

/*

Only for O and 1 index cycle sort Issue -> Nothing relate with missing number

here there is issue with cycle sort ,

when the given array is starting from 0
 int correctIndex = arr[i];
 because let say the array is {3,5,2,1,4,0};
 now the index to check the correct index is starting from 0 so no out of bound index error

 when the correct index is starting from 1
  int correctIndex = arr[i]-1;
  same for this

  but vice versa can cause out of index bound error and comparisons error
  check this in chatgpt and understand it from there

*/

public class JAVA01_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,0};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int CyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
