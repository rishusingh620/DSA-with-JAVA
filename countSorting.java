public class countSorting {

    static  int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }

static void display(int[] arr){
    for(int val: arr){
        System.out.println(val+" ");
    }
}

    static void CountSort(int[]arr){

        int n= arr.length;
        int[] output=new int [n];

        int max=findMax(arr);  // find maximum element in array

          int[] count=new int[max+1];

          for(int i=0;i<arr.length;i++){   // make a frequency Array
              count[arr[i]]++;

        }
          // make prefix sum array of count array
            for(int i=n-1;i<arr.length;i++){
        count[i]+=count[i-1];

    }

// find the index of each element of each element in the original array and put it in output array

 for (int i = n - 1; i >= 0; i--) {
        int idx = count[arr[i]] - 1;
        output[idx] = arr[i];
        count[arr[i]]--;
    }
// copy all elements  of output to array
 for (int i=0;i<n;i++){
    arr[i]=output[i];
    }

}
    public static void main(String[] args) {
        int [] arr={1,2,4,7,5,3,8,0,9};
        CountSort(arr);
        display(arr);
    }
    }





