package JAVA04_InterviewQues;

public class JAVA06_PeakIndexArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println("Peak Index: " + peakIndex(arr)); // Expected output: 4
    }

    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { // Loop continues until start and end converge
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the decreasing part of the array
                // Mid might be the peak, so move end to mid
                end = mid;
            } else {
                // You are in the ascending part of the array
                // Peak must be after mid, so move start to mid + 1
                start = mid + 1;
            }
        }

        // Start and end converge to the peak index
        return start; // or return end, both are the same
    }
}

/*
{1,2,3,4,5,4,3,2,1}
mid = 5
if (check mid>mid+1 i.e -> 5>4 -> true) {
end = mid }
else(above case is not true, means 5>4 -> false){
start = mid + 1 }
the array is updated continuously via while loop and it comes down to only one element
which is both start and end , thus this is our element . while loop condition breaks .
 */

