public class QuickSort {

    static void displayArray(int [] arr){

        for(int val: arr){
            System.out.println(val);
        }
    }
static void swap(int [] arr,int x, int y){
        int temp=arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
}

static int partion(int []arr, int str, int end) {

    int pivot=arr[str];
// count elements less than pivot
    int cnt=0;
    for(int i=str+1;i<=end;i++){
        if(arr[i]<=pivot) cnt++;
    }
     int pivotIdx=str+cnt;

    swap(arr,str,pivotIdx);
    int i=str,j=end;

    // element lesser or equal - left side of pivotIdx,greater-> right side of pivotIdx
    while(i<pivotIdx && j>pivotIdx){
        while(arr[i]<pivot) i++;
        while(arr[j]>pivot) j--;

      if(i<pivotIdx && j>pivotIdx){

          swap(arr,i,j);
          i++;
          j--;
      }
      }

return pivotIdx;
}

static void quickSorting(int [] arr,int str,int end){

        if(str>=end) return;

        int pi= partion(arr,str,end);
        quickSorting(arr,str,pi-1);
        quickSorting(arr,pi+1,end);
}


    public static void main(String[] args) {

    int []arr={9,6,5,2,3,7,1,4};

        System.out.println("array before sorting");
        displayArray(arr);
        System.out.println();

        quickSorting(arr,0,arr.length-1);

        System.out.println("Array After Sorting");
        displayArray(arr);

    }
}
