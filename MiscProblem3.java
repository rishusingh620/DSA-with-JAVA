import java.util.Scanner;

public class MiscProblem3 {



    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }

    }

    static int[]rotateArray(int[]arr,int k) {
        int n = arr.length;
        k %= n;
        int[] ans = new int[n];

        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];

        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter size of arr");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter"+n+"elements");
        for(int i = 0; i < n ; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter k");
        int k=sc.nextInt();

        System.out.println("originat arr");
        printArray(arr);

        int[]ans=rotateArray(arr,k);

        System.out.println("arter rotation");
        printArray(ans);







    }







}
