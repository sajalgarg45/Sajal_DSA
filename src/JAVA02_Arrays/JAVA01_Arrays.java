package JAVA02_Arrays;

public class JAVA01_Arrays {
    public static void main(String[] args) {

        // Store 5 Roll Numbers
        int[] roll1 = new int[5]; // Dynamic Memory Allocation
        // here roll1 is reference variable and new int[5] is object
        // or
        int[] roll2 = {12,13,14,15,16};
        // So the reference variable is pointing to this array object

        int[] ros; // declaration of array -> ros is getting defined in stack -> Compile Time
        ros = new int[5]; // initialisation -> object is being created in the heap memory -> Run Time

    }
}
/*
In c++ there is continuous Memory Allocation but in java there is not concept of pointer and address
1> Array objects is in heap
2> Heap objects are not continuous
3> Dynamic Memory Allocation
Hence -> Internally May not be continuous , it depends on JVM
4> For Integer array the by default value at each index is zero like {0,0,0,0,0}
5> for String it is null -> special value for reference variables
6> each element of an array is itself a object and stored in different parts of the memory
*/
