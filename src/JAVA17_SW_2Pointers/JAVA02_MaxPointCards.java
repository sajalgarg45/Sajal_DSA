package JAVA17_SW_2Pointers;

public class JAVA02_MaxPointCards {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int a = MaxPoints(arr, k);
        System.out.println("Maximum Points: " + a);
    }

    public static int MaxPoints(int[] arr, int k) {
        int n = arr.length;
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum + arr[i];
        }
        int maxSum = leftSum;
        int rightSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum - arr[k - 1 - i];          // Remove from left
            rightSum = rightSum + arr[n - 1 - i];         // Add from right
            if (leftSum + rightSum > maxSum) {
                maxSum = leftSum + rightSum;
            }
        }
        return maxSum;
    }

}