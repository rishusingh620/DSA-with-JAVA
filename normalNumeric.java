import java.util.Scanner;

public class normalNumeric {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter rows");
        int r=sc.nextInt();

        System.out.println("enter column");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1; j<=c;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
