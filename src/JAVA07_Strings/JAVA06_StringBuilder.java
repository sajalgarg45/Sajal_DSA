package JAVA07_Strings;

public class JAVA06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('A'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder.toString());
    }
}
/*
here understand from previous file , there is itself a function named string builder which is mutable
 */