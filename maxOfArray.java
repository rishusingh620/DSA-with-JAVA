class maximumOfArray{
    void ArrayMax(){

        int arr[]={3,6,4,8,7,9,1,2};

        int ans=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans) {
                ans = arr[i];
            }
            }
        System.out.println("max"+ans);
        }

}


public class maxOfArray {
    public static void main(String[] args) {

        maximumOfArray obj=new maximumOfArray();
        obj.ArrayMax();
    }
}
