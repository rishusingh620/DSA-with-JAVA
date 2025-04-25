public class FindAllIndices_array_Recursion {

    static void findAllIndices(int[] arr, int n, int target, int idx) {

        if (idx >= n) {
            return;
        }

        if (arr[idx] == target) {
            System.out.println(idx);
        }

        findAllIndices(arr,n,target,idx+1);

    }

    public static void main(String[] args) {

        int[]arr={2,3,4,4,5,4,7};

        int target=4;
        int n=arr.length;
        findAllIndices(arr,n,target,0);
    }
}