public class Last_index {

    static int Find_Last_index(int[]arr,int n, int target,int idx){

        if(idx<0) return -1;

        if(arr[idx]==target) return idx;

        return Find_Last_index(arr,n,target,idx-1);
    }

    public static void main(String[] args) {
        int [] arr={1,3,4,5,2,4,7,4,9};

        int n=arr.length;
        int target=4;

        System.out.println(Find_Last_index(arr,n,target,n-1));
    }
}
