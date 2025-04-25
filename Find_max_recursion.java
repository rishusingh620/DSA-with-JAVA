public class Find_max_recursion {

    static int maxInArray(int []arr,int idx){

        if(idx==arr.length-1){      // base case
            return arr[idx];
        }

        int SmallAns=maxInArray(arr,idx+1);  // recursive work

        return Math.max(arr[idx],SmallAns);

    }

    public static void main(String[] args) {

        int []arr={3,6,7,8,9};

        System.out.println(maxInArray(arr,0));
    }
}
