package JAVA02_Arrays;
import java.util.ArrayList; // Implement form Java collection framework

public class JAVA06_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // here we don't add primitives , we add wrappers which come in OOPS
        list.add(67);
        list.add(21);
        list.add(521);
        list.add(21231);
        System.out.println(list);
        System.out.println(list.contains(21));

        /*
        Size is fixed internally
        when arraylist is about to fill the list increase its size or double the size
        study more about this in Time and space complexity
        */
    }
}
