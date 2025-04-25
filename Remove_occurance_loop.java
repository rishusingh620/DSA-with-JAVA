import java.util.Scanner;

public class Remove_occurance_loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String ans= new String();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'a') {
                ans += s.charAt(i);
            }
        }

        System.out.println(ans);
    }

    }
