class ArrayExample3{

    void multiArray2() {

        int[][] arr = {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);


            }
        }
    }


        void demoArray2(){

            int[] ages=new int[3];

            ages[0]=32;
            ages[1]=45;
            ages[2]=21;

            for(int i=0;i<ages.length;i++){
                System.out.println(ages[i]);
            }

            // for each loop
             for(int age : ages){
                 System.out.println(age);
             }

             //while loop
        int i=0;

             while (i<ages.length){

                 System.out.println(ages[i]);

                 i++;
             }



    }
}

public class Array3 {

    public static void main(String[] args) {

      ArrayExample3 obj=new ArrayExample3();

      obj.demoArray2();
        obj.multiArray2();

    }
}
