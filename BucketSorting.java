import java.util.ArrayList;
import java .util.Collections;

public class BucketSorting {

    static void bucketSort(Float[] arr) {

        int n = arr.length;

        // buckets
        ArrayList<Float>[] bucket = new ArrayList[n];// create empty buckets

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }
        // add elements into buckets

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            bucket[bucketIndex].add(arr[i]);
        }

        // sort each bucket Individually

        for (int i = 0; i < n; i++) {
            Collections.sort(bucket[i]);
        }

        // merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0; j <currBucket.size(); j++)
            arr[index++] = currBucket.get(j);
        }
    }

    public static void main(String[] args) {

        Float [] arr= {0.5f,0.4f,0.9f,0.1f};

        bucketSort(arr);
        for(Float val : arr){
            System.out.println(val+" ");
        }
    }

}
