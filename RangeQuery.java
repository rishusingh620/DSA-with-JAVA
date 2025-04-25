import java.util.Scanner;

public class RangeQuery {

    static int[] makePrefixArray(int[]arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("enter" + n + "elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = makePrefixArray(arr);

        System.out.println("enter number of queries");
        int q = sc.nextInt();
        while (q-- >0) {
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];
            System.out.println("sum" + ans);
        }

    }




}
