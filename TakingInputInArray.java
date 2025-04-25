import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Array size");


        int n=sc.nextInt();
        int []arr=new int[5];

        System.out.println("enter Array"+n+ "elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
