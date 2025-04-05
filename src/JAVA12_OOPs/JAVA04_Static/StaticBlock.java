package JAVA12_OOPs.JAVA04_Static;

// this is a demo to show initialisation of static variables .
// static variables are obviously independent to objects

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once , when the first obj is created i.e. when the class is loaded for
    // the first time
    static {
        System.out.println("I am a static Block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "  + StaticBlock.b);

        StaticBlock.b +=3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "  + StaticBlock.b);

    }
}