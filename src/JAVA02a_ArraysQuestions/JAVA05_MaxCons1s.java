package JAVA02a_ArraysQuestions;

public class JAVA05_MaxCons1s {

    public static void main(String[] args) {
        int[] a = {1,1,2,2,1,1,1,1,3,3,1,1};
        int store = 0;
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==1){
                count++;
                if(store<count){
                    store = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(store);
        otherCons();
        appearance();
    }

    public static void otherCons(){
        int[] arr = {2, 2, 2, 3, 3, 1, 1, 1, 1, 4, 4,4,4,4,4};
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        System.out.println("Count: " + maxCount);
    }

    public static void appearance(){
        int[] arr = {4, 1, 2, 1, 2};
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        System.out.println("Unique element: " + ans);
    }

}
