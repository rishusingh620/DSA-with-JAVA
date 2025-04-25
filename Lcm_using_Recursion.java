import java.util.Scanner;

public class Lcm_using_Recursion {


    static int gcd(int x,int y) {

        if (y == 0) return x;  // base case

        return gcd(y, x % y);  // using Euclid's Algorithm
    }

    static int LCM(int x,int y){
        int lcm= (x*y) / gcd(x,y);

        return lcm;

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int x=  sc.nextInt();
        int y= sc.nextInt();

        System.out.println(gcd(x,y));

    }
}
