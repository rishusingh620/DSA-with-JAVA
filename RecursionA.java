import java.util.Scanner;

public class RecursionA {

    static void PrintIncreasing(int n){

        if (n==1){

            System.out.println(n);
             return;
        }

        PrintIncreasing(n-1);
        System.out.println(n);



    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        int n= Sc.nextInt();

        PrintIncreasing(n);
    }

}
