import java.util.Scanner;

public class WhileLoop2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int num=1;
        int sum =0;
        while(num<=n){

            sum = sum+n;
            num++;
        }
        System.out.println(sum);



    }
}
