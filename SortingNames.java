public class SortingNames {

    static void sortFruits(String[] Fruits){

        int n=Fruits.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;

            for(int j=i+1;j<n;j++){

                if(Fruits[j].compareTo(Fruits[min_index])<0){

                    min_index=j;
                }
            }
              String temp=Fruits[i];
            Fruits[i]=Fruits[min_index];
            Fruits[min_index]=temp;

        }
    }


    public static void main(String[] args) {

        String [] fruits={"papaya","orange","apple","grapes"};
        sortFruits(fruits);

        for( String val : fruits){
            System.out.println(val+" ");
        }
    }
}
