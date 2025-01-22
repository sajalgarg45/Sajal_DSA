package JAVA04_InterviewQues;

public class JAVA13_MaxSubSequence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,-10};
//        int a = maxSubArraySum1(arr);
//        int a = maxSubArraySum2(arr);
        int a = maxSubArraySum4(arr);
        System.out.println(a);

    }


    // Method 1 -> Maximum SubSequence -> O(n3)

//    public static int maxSubArraySum1(int[] arr){
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k < j; k++) {
//                    sum +=arr[k];
//                }
//                if(sum >max){
//                   max =sum;
//                }
//            }
//        }
//        return max;
//    }


    // Method 2 -> Maximum SubSequence -> O(n2) -> Kadane's Algorithm

//    public static int maxSubArraySum2(int[] arr) {
//        int maxSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int currentSum = 0;
//            for (int j = i; j < arr.length; j++) {
//                currentSum += arr[j];
//                if (currentSum > maxSum)
//                    maxSum = currentSum;
//            }
//        }
//        return maxSum;
//    }


    // Method 3 -> O(n)

//    public static int maxSubArraySum3(int[] arr) {
//        int max = 0;
//        int sum = 0;
//        int i = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if (sum < 0) {
//                i = j;
//                sum = 0;
//            }
//            sum += arr[j];
//            if (sum > max)
//                max = sum;
//        }
//        return max;
//    }

    // Method 4 -> it covers all the testcases , also used to cover negative integers

        public static int maxSubArraySum4(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
}
