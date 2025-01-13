package JAVA00_Assignment;
import java.util.Scanner;

// Pythagorean Triplet - 

public class JAVA01_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array - ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean a = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    int x = arr[i]*arr[i];
                    int y = arr[j]*arr[j];
                    int z = arr[k]*arr[k];

                    if( (x==(y+z)) || (y==(x+z)) || (z==(x+y)) ){
                        a = true;
                        break;
                    }
                }
            }
        }
        if (a) {
            System.out.println("Triplet found");
        }
        else{
            System.out.println("triplet not found");
        }
    }
}

