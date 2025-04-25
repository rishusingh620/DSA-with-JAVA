import java.util.Scanner;

public class SortArray {

    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void SortZeroesAndOnes(int[]arr){

        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        printArray(arr);
        System.out.println( );
        SortZeroesAndOnes(arr);
        System.out.println("after sorting");
        printArray(arr);
    }
}
