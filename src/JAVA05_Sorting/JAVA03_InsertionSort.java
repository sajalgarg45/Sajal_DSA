package JAVA05_Sorting;

/*
the array is like -
{5,3,4,1,2} -> Array
 0 1 2 3 4  -> Indexing
here i = 0 and j = i+1 (1)
and j check each i to sort in the given range
like in first check ->  value of i=5 and j =3 , so is 3>5 no -> swap new array be like {3,5,4,1,2}
here first check or pass 1 means array is sorted till index 1
increment the value of i ad j
base condition-> so now j > 0 and i <= n-2
if j > j-1 it means array is started to get sort and we don't have o check for the elements in the left 
here the loop value of i is going i <= n-2 -> because j should not got to index out of bounds

Time complexity ->
worst case O(n2)
best case O(n)

it is stable , use for smaller value of n , works good when partially the array is sorted
it take part in hybrid sorting algorithms


 */
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
