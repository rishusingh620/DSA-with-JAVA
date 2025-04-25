import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        int n =sc.nextInt();

        int numberOfDigits=0;
        int Original_num= n;

        while(n>0){

           n= n / 10;

           numberOfDigits++;

        }

        System.out.println("number of digits in "  + n + "=" +numberOfDigits);
    }
}
