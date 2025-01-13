package JAVA03_Searching;
import java.util.Arrays;

public class JAVA02_SearchInString {
    public static void main(String[] args) {
        String name = "sajal";
        char target = 'k';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
    }
    static boolean search (String str , char target){
        if(str.length()==0){
            return false;
        }
//        for (int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }

        // or
        // here the for each loops works as
        // Arrays.toString(name.toCharArray())
        for(char a : str.toCharArray()){
            if(a==target){
                return true;
            }
        }
        return false;
    }
}
