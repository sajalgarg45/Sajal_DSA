package JAVA02_Arrays;

import java.util.Arrays;

public class JAVA03_Array_Function {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){ // Here the array of object is passed
        arr[0] = 99; // it changes the value because it points to the same object
    } // Arrays are mutable in java - change the object ,  and strings are non-mutable
}
