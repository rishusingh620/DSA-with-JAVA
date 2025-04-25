public class SearchElement_printIndex_recursion {

    static int Search(int[] arr, int n, int target, int idx) {

        if (idx >= n) return -1;

        if (arr[idx] == target) return idx;

        return Search(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 4, 5, 6, 7, 8, 9};

        int target = 5;

        System.out.println(Search(arr, arr.length, target, 0));
    }
}