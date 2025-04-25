class ArraySum{

    void ArrayISum(){
        int []arr={1,5,4,6,4};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
}



public class sumOfArray {
    public static void main(String[] args) {
        ArraySum obj=new ArraySum();
        obj.ArrayISum();
    }
}
