import java.util.Scanner;


public class CharacterRead {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("entert a character:");

        char ch=sc.next().charAt(4);

        System.out.println("character is :"+ ch);

    }
}
