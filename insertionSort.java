public class insertionSort {

    static void Insertion_sorting(int []arr){

        int n= arr.length;

        for(int i=1;i<n;i++){

            int j=i;

            while(j>0 && arr[j]<arr[j-1]){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {

        int[]arr={5,9,7,8,6,4,2,3};

        Insertion_sorting(arr);

        for(int val:arr){
            System.out.println( val+" ");

        }
    }




}
