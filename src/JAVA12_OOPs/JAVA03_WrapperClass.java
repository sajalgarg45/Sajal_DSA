package JAVA12_OOPs;

public class JAVA03_WrapperClass {
    public static void main(String[] args) {

        int a = 10;     // primitive , not an object
        int b = 20;
        swap(a,b);  // will not swap , doubt go to GPT
        System.out.println(a+" "+b);

        Integer a1 = 10;   // it is an object
        Integer b1 = 20;
        swap2(a1,b1);
        System.out.println(a+" "+b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap2(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    /*
    final is a keyword - used ot prevent your content to be modified
    always initialise while declaring it
    */

    final int bonus = 2;    // final keyword
    final A john = new A("John Doe");
    // when a non primitive is final , you cannot reassign it
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}