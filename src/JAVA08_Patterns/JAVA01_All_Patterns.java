package JAVA08_Patterns;

public class JAVA01_All_Patterns {
    public static void main(String[] args) {

        int a = 4;

//        Pattern1(a);
//        Pattern2(a);
//        Pattern3(a);
//        Pattern4(a);
//        Pattern5(a);
//        Pattern6(a);
//        Pattern7(a);
//        Pattern8(a);
//        Pattern9(a);
//        Pattern10(a);
//        Pattern11(a);
//        Pattern12(a);
//        Pattern13(a);
//        Pattern14(a);
//        Pattern15(a);
//        Pattern16(a);
//        Pattern17(a);

}

    // PATTERN 1
    public static void Pattern1(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // PATTERN 2
    public static void Pattern2(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // PATTERN 3
    public static void Pattern3(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    // PATTERN 4
    public static void Pattern4(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    // PATTERN 5
    public static void Pattern5(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // PATTERN 6
    public static void Pattern6(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    // PATTERN 7
    public static void Pattern7(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // PATTERN 8
    public static void Pattern8(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*a)-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // PATTERN 9
    public static void Pattern9(int a){
        for(int i=1;i<=2*a-1;i++){
            int stars = i;
            if(i>a){stars=2*a-i;}
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // PATTERN 10
    public static void Pattern10(int a){
        int start = 1;
        for (int i = 0; i < a; i++) {
            if(i%2==0){start = 1;}
            else {start = 0;}
            for (int j = 0; j <i+1; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    // PATTERN 11
    public static void Pattern11(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < (2*a)-((i+1)*2); j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // PATTERN 12
    public static void Pattern12(int a){
        int count = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    // PATTERN 13
    public static void Pattern13(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)(j + 65));
            }
            System.out.println();
        }
    }

    // PATTERN 14
    public static void Pattern14(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print((char)(j + 65));
            }
            System.out.println();
        }
    }

    // PATTERN 15
    public static void Pattern15(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)(i + 65));
            }
            System.out.println();
        }
    }

    // PATTERN 16
    public static void Pattern16(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j < 2*i+1; j++) {
                if(j>=i){
                    System.out.print(ch--);
                }else{
                System.out.print(ch++);
                };
            }
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // PATTERN 17
    public static void Pattern17(int a){

        for (int i = 0; i < a; i++) {
            int z = 65;
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)(z+a-i));
                z++;
            }
            System.out.println();
        }
    }

}
