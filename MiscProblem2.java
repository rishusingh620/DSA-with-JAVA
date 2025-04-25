public class MiscProblem2 {
    static void swapInArray(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }

    }
        static void reverseArray( int[]arr){

            int i = 0, j = arr.length - 1;

            while (i < j) {
                swapInArray(arr, i, j);
                i++;
                j--;
            }
        }




    public static void main(String[] args) {

               int[]arr={2,3,4,5,6};
               reverseArray(arr);
               printArray(arr);
    }

}














