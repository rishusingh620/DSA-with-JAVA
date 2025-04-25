import java.util.Scanner;

public class RotateMatrix {


    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for( int j=0;j<matrix[i].length;j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
    }

    static void transposeInplace(int [][]matrix,int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }

    static void reverseArray(int[]arr){
        int i=0,j=arr.length-1;

        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate (int [][] matrix,int n){

        transposeInplace(matrix,n,n);

        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter number of rows and column of matrix");

        int r= sc.nextInt();
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];
        int totalElement=r*c;

        System.out.println("enter"+totalElement+"value");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);


        rotate(matrix,r);

        System.out.println("rotated matrix");
        printMatrix(matrix);
    }
    
}
