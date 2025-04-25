import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100006];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

        }
    return freq;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter "+n+"elements");
        for (int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();

        }

        int[]freq=makeFrequencyArray(arr);

        System.out.println("enter number of queries");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("enter number to be searched");
            int x=sc.nextInt();

            if(freq[x]>0){
                System.out.println("yes present");
            }
            else{
                System.out.println("not present");
            }
            q--;
        }
    }

}




