package JAVA02a_ArraysQuestions;

public class JAVA04_Union2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            combined[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combined[index++] = arr2[i];
        }

        int[] temp = new int[combined.length];
        int tempIndex = 0;
        for (int i = 0; i < combined.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < tempIndex; j++) {
                if (combined[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = combined[i];
            }
        }

        System.out.print("Union of arrays: ");
        for (int i = 0; i < tempIndex; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
