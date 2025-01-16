package JAVA07_Strings;

import java.util.ArrayList;

public class JAVA04_Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 3);
        System.out.println((char)('a'+3));
        System.out.println("a" + 3);
        // integer is converted to integer that will call toString()
        // this is same as after a few steps: "a" + "1"
        System.out.println("Sajal" + new ArrayList<>());
        System.out.println("Sajal" + new Integer(55));

//        System.out.println(new Integer(56) + new ArrayList<>());
        // to run this we convert it into
        System.out.println(new Integer(56) +" "+ new ArrayList<>());
    }
}
/*
the + operator in java is only applicable if two data types is primitive or one of them is string
 */