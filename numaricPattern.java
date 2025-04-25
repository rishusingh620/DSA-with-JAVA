import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class numaricPattern {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter rows");
        int r=sc.nextInt();

        for(int i=1;i<=r;i++){
            for( int j=i;j<=r;j++){
                System.out.print(j);
            }
            for( int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
