package JAVA17_SW_2Pointers;
import java.util.Arrays;

public class JAVA01_LongSubArrSumLessThanK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0, 0, 0, 9};
        int k = 4;
        int[] result = longestSubArray(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] longestSubArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        int currentSum = 0;
        int maxLength = 0;

        int SubStart = 0;
        int SubEnd = -1;

        while (right < nums.length) {
            currentSum += nums[right];

            while (currentSum >= k && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                SubStart = left;
                SubEnd = right;
            }
            right++;
        }

        System.out.println("Longest subArray length = " + maxLength);

        int[] result = new int[maxLength];
        for (int i = SubStart; i <= SubEnd; i++) {
            result[i - SubStart] = nums[i];
        }
        return result;
    }

}