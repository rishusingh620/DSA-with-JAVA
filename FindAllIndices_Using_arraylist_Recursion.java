
import java.util.ArrayList;

public class FindAllIndices_Using_arraylist_Recursion {


    static ArrayList<Integer> allIndices(int[] arr, int n, int target, int idx) {


        if (idx >= n) {

            return new ArrayList<Integer>();

        }
        ArrayList<Integer> Ans = new ArrayList<>();
        if (arr[idx] == target) {

            Ans.add(idx);

        }


        ArrayList<Integer> NewAns = allIndices(arr, n, target, idx + 1);
        Ans.addAll(NewAns);

        return Ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 4, 4, 7, 8};

        int target = 4;
        int n = arr.length;

        ArrayList<Integer> Ans = allIndices(arr, n, target, 0);

           for(Integer i:Ans){            // for each loop
               System.out.println(i);
           }
    }
}