import java.util.Scanner;

public class MiscProblem4 {


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }

    }
    static void swapInArray(int[]arr,int i ,int j){

        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[]arr,int i, int j){

        while(i<j){

            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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

        rotateInPlace(arr,k);

        System.out.println("arter rotation");
        printArray(arr);


    }





}
