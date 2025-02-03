package JAVA11_Recursion2;

/*
Used for permutation and combination
Ex - [3,5,9] - [3],[3,5],[3,9],[3,5,9],[5,9],[5],[9]
This pattern of taking some elements and removing some is known as subset pattern
Two Choices - Take it or ignore it


*/

public class JAVA01_Subsequence {
    public static void main(String[] args) {
        subSequence("","abc");
    }
    static void subSequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }
}
