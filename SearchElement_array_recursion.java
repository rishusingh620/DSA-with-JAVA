public class SearchElement_array_recursion {

    static boolean search(int [] arr,  int n, int target, int idx){

        if(idx>=n) return false;

        if (arr[idx]==target) return true;

        return search(arr,n,target,idx+1);
        }


    public static void main(String[] args) {

        int [] arr={3,4,5,6,7,8,9,1,2,};

        int target=6;

        if(search(arr,arr.length,target,0)){
            System.out.println("yes");
        }

        else{
            System.out.println("no");
        }
    }
}
