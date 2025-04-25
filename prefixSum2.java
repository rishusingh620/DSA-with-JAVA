import java.util.Scanner;

public class prefixSum2 {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] makePrefixArray(int[]arr){
        int n=arr.length;
        int [] pref= new int[n];
        pref[0]=arr[0];

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[]arr= new int [n];

        System.out.println("enter"+n+"elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);

        int[] pref=makePrefixArray(arr);
        System.out.println("output Arrray");
        printArray(pref);
    }













}
