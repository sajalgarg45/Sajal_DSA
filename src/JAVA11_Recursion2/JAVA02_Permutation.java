package JAVA11_Recursion2;

/*
Permutation -

"/abc
Step 1 -> a/bc
Step 1 -> ba/c or ab/c
Step 1 -> cba/" or bca/" or bac/"   ||   cab/" or acb/" abc/"
3! = 6
No. of Recursive call is dependent on the size of process
No. of Recursive Calls = Size of process + 1

Here
P stands for processed
Up stands for Unprocessed
*/

public class JAVA02_Permutation {
    public static void main(String[] args) {
        permutations("","abc");
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }
}
