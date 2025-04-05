package JAVA12_OOPs.JAVA04_Static;

// outside classes cannot be static -. Because they cannot be dependent on another class
// only inner classes can be static - because this class is dependent on outside class

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("sajal");
        // it gives error because the test class is itself depend on the outside class
        // then whose your object , if we make it static then the error is gone
        Test b = new Test("john");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
