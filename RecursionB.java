import java.util.Scanner;

public class RecursionB {

    static void PrintDecreasing(int n){
        // base  case
        if (n==1){

            System.out.println(n);
            return;
        }

        // self work
        System.out.println(n);


         // recursive work
        PrintDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        int n= Sc.nextInt();

        PrintDecreasing(n);
    }



}
