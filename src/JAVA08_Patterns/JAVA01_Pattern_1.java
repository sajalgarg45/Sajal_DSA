package JAVA08_Patterns;

public class JAVA01_Pattern_1 {

    public static void main(String[] args) {
        int a = 5;
        Pattern_1(a);
        System.out.println();
        Pattern_2(a);
        System.out.println();
        Pattern_3(a);
    }

    static void Pattern_1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* "); // don't use println
            }
            // when one row complete we need to add new line
            System.out.println();
        }
    }
    static void Pattern_2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern_3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col); // don't use println
            }
            // when one row complete we need to add new line
            System.out.println();
        }
    }
}
