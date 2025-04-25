import java.util.Scanner;

public class Palaindrome_String_Recursion {

    static String reverse(String s) {


        if (s.length() == 0) return "";

        String smallAns = reverse(s.substring(1));

        return smallAns += s.charAt(0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

       String rev=reverse(s);

        if (rev.equals(s)) {

            System.out.println("palaindrome");
        }
        else{
            System.out.println("not palaindrom");
        }
    }
}