import java.lang.reflect.Array;

public class SumOf_Array_Recursion {


    static int ArraySum(int[]arr, int idx){

        if(idx==arr.length){    // base case
            return  0;
        }

        int SmallAns=ArraySum(arr,idx+1);  // recursive work

        return SmallAns+arr[idx];    // self work
    }


    public static void main(String[] args) {

        int []arr={3,4,5,8,6};

        System.out.println(ArraySum(arr,0));


    }
}
