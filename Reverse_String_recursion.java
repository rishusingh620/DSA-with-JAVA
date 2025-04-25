import java.util.Scanner;

public class Reverse_String_recursion {

    static String Reversestring(String s,int idx){

        if(idx==s.length()) return "";

        String smallAns=Reversestring(s,idx+1);

        return smallAns+=s.charAt(idx);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        System.out.println(Reversestring(s,0));
    }
}
