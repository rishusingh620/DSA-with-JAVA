public class Recursion1A {

    static int Factorial(int n){

        //base case

        if(n==0) return 1;

        // smaller problem-recursive work

         return n*Factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }
}
