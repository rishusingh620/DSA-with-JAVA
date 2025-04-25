import java.util.Scanner;


public class hello2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter first number :");
        int num_1=sc.nextInt();

        System.out.println("enter second number:");
        int num_2=sc.nextInt();

        int sum=num_1+num_2;
        System.out.println("sum :"+sum);

    }
}
