package JAVA04_InterviewQues;

public class JAVA12_SplitArrayLargestSum {

    public static void main(String[] args) {

    }
    static int splitArray(int[] arr , int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length ; i++) {
            start = Math.max(start,arr[i]);
            end = end+arr[i];
        }
        // Binary Search
        while(start<end){
            // we try to get middle as a potential answer
            int mid = start + (end-start)/2;
            // calculate the max sum till the limit of mid
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if(sum+num>mid){
                    // We cannot add elements in sub array
                    // New sub array has to be created
                    sum = num;
                    pieces++;
                }
                else{
                    sum  = sum+num;
                }
            }
            if(pieces  > m){
                 start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end; // here start = end
    }
}
