package JAVA07_Strings;

public class JAVA05_Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('A'+i);
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
/*
but this above method is not good ,
because new object is created every time , as strings are immutable it is creating a new object
everytime , dereferencing is there multiple times .
time complexity is going O(n2)

String builder -> only one object is created and the changes are done on that object only
reference is also same
 */