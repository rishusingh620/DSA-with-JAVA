import java.util.Scanner;

public class multiDimensionArray {

    static void printArray(int[][]arr){

        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] arr2={  {3,4,5},
                         {6,7,8},
                          {2,1,9},   };

            printArray(arr2);
    }




}
