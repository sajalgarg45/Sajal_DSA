package JAVA03_Searching;
import java.util.Arrays;


/*
sorted array - {2,4,5,7,9,10};
after 1 rotation
array - {10,2,4,5,7,9}
after 2 rotation
array - {9,10,2,4,5,7}

find the pivot in the array - where the array is changing or largest no. in the array
meaning form above after 2 rotation - pivot is 10
every sorted rotated array -> ascending : pivot : ascending

Approach No.1 -
To solve this ques - find the pivot and then the two sub arrays is there , the first half and then
second half .
first half -> (0,pivot)
second half -> (pivot , array.length)
Ex - {3,4,5,6,7,0,1,2,}
because in binary search we are traversing the middle
so to find the pivot we traverse the mid

* case1 - pivot = mid > mid+1 ex - [7,0] here mid>mid+1 here mid can be 7
* case2 - pivot = mid < mid-1 ex - [7,0] here mid<mid-1 here mid can be 0
* case3 - pivot = start >= mid - it means that element form start to mid-1 is greater than mid to end
{3,4,5,6,7,0,1,2,} here if mid is 0 , it means {3,4,5,6,7} is greater than {0,1,2,}
so new end is mid-1 , searching ranges from (start to mid-1)
* case4 - pivot = start < mid - it means if the array is {3,4,5,6,2}
so the start is 3, mid is 5 and end is 2 , so the start is less than mid , from that we understand
new start is mid + 1 , we search for pivot from mid+1 to end;

from above cases we understand that if mid == pivot then we have caught the pivot from case 1,2

 */

public class JAVA10_PivotInArray{
    public static void main(String[] args) {
        int[]arr = {3,4,5,6,7,0,1,2};
        int ans = findPivot(arr);
        System.out.println(arr[ans]);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]> arr[mid+1]){ // mid<end it ensures array don't go out of bounds
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}