class ArraySearch{

    // created a method or function
    void SearchingArray(){
        int arr[]={10,8,9,6,5,4,7};
        int x=7;
        int ans=-1;

        for(int i=0;i<arr.length;i++) {

            if(arr[i]==x){
                ans=i;
            }
        }
        System.out.println("found="+x+ "at index="+ans);
    }
}


//function calling or method calling

public class searchInArray {
    public static void main(String[] args) {

        ArraySearch obj=new ArraySearch();
        obj.SearchingArray();


    }
}
