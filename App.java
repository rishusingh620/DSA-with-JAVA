public class App {

    static void change_Array(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;

        }
    }

    public static void main(String[] args) {

        int[]arr=new int [3];

        arr[0]=8;
        arr[1]=6;
        arr[2]=7;

        change_Array(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
