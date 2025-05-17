package JAVA05_Sorting;

public class JAVA03_InsertionSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        printArray(array);
        insertionSort(array);
        System.out.println("Sorted Array:");
        printArray(array);
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
