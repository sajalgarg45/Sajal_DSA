package JAVA05_Sorting;
import java.util.Arrays;
public class JAVA01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        // there is an issue in it , it is also checking for the values which is sorted
        // to avoid the unnecessary iterations we use boolean
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap smaller and bigger item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not wap for particular i it means arrays is sorted
            if(!swapped){ // swapped == flase
                break;
            }
        }
    }
}
