package JAVA02_Arrays;

public class JAVA07_TripletFounder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9};
        System.out.println(noTriples(arr));
    }

    private static boolean noTriples(int[] arr) {
        if (arr.length < 3) return true;

        for (int i = 0; i < arr.length - 2; i++)  {
            if (arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2])
                return false;
        }
        return true;
    }
}