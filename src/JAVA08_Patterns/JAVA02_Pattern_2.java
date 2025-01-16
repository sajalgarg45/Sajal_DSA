package JAVA08_Patterns;

public class JAVA02_Pattern_2 {
    public static void main(String[] args) {
        int a = 4;
        Pattern_1(a);
    }
    static void Pattern_1(int n){
        for(int row=0;row<2*n;row++){
            int colInRow = row>n ? 2*n-row:row;
            for (int col = 0; col < colInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
