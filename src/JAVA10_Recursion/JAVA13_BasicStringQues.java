package JAVA10_Recursion;

/*

b a c c a d --> remove a --> b c c d
whenever a comes skip it
char = b -> Yes
[b] + [a c c a d]
char = a -> No
char = c -> Yes
[b c] + [c c a d]
similarly it will continues ..

*/

public class JAVA13_BasicStringQues {
    public static void main(String[] args) {
        skip("","baccadah");
        System.out.println(skipApple("dfapplesdfv"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(1));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
