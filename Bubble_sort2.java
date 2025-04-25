public class Bubble_sort2 {


    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag== false){
                return;
            }
        }
    }

    public static void main(String[] args) {

        int []arr={1,2,3,5,4,6,7};

        bubbleSort(arr);

        for(int i: arr){
            System.out.println(i);
        }
    }
}