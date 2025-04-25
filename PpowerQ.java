import java.util.Scanner;

public class PpowerQ {
    static  int pow(int p,int q){

//        base case
        if(q==0){
            return 1;
        }

        return pow(p,q-1) * p;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(pow(5,2));
    }

}
