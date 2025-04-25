import java.util.Scanner;

public class partationArray {

    static int findArraySum(int[]arr){

        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];

        }
        return totalSum;
    }

    static boolean equalPartation(int[]arr){
        int totalSum=findArraySum(arr);

        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum=prefSum+arr[i];
            int suffixSum=totalSum-prefSum;

            if(suffixSum==prefSum){
                return true;
            }
        }

       return false;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("enter" + n + "elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("equyal partion possible"  +equalPartation(arr));



    }








}
