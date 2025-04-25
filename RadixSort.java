public class RadixSort {

    static int findMax(int [] arr){
          int mx= Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
              if(arr[i]>mx){
                  mx=arr[i];
              }
          }
          return mx;
    }
    static void countSort(int []arr,int place){
        int n=arr.length;

        int []output= new  int [n];
        int []count= new int [10];

        // make frequency array

        for ( int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }

        // make prefix sum of count sort

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        // find the index of each element in the original array and put it in output array

        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        // copy all elements of output to array

        for(int i=0;i<n;i++){
             arr[i]=output[i];
        }
    }

    static  void radixSort(int[]arr){

        int max=findMax(arr);
        // apply count Sotrting to sort elements place wise
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int []arr={84,789,987,683,473,732,7,982};

                radixSort(arr);

                for(int val:arr){
                    System.out.println(val+" ");
                }
    }
}
