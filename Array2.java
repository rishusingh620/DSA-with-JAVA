class ArrayExample2{

    void multiArray(){

        int [][] arr={ {56,43,6},{34,7,8},{12,56,8}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }

}


public class Array2 {
    public static void main(String[] args) {

        ArrayExample2 obj=new ArrayExample2();
        obj.multiArray();

    }
}
