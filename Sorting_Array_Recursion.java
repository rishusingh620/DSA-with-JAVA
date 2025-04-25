public class Sorting_Array_Recursion {

    static boolean IsSorted(int[] arr,int n,int idx){

        if(idx>=n-1) {
            return true;
        }

        if(arr[idx]<arr[idx+1]){

            return IsSorted(arr,n,idx+1);

        }

        else {
            return false;
        }
    }


    public static void main(String[] args) {
        int []arr={1,2,9,4,56};

        int n= arr.length;

        if(IsSorted(arr,n,0)){
            System.out.println("Sorted");
        }

        else{
            System.out.println("not sorted");
        }
    }
    }

