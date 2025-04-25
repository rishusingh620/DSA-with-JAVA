import java.util.Scanner;

public class Recursion2A {

    static int Sod(int n){

        // base case
        if(n>=0 && n <= 9){
            return n;
        }

       // recursive work
         int SmallAns=Sod(n/10);

        //self work
        return SmallAns + n%10;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(Sod(1234));
    }
}
