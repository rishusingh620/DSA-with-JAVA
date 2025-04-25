import java.lang.reflect.Array;
import java.util.ArrayList;

public class listArrayProblem1 {

    static  void reverseArray(ArrayList<Integer>list){
        int i=0, j=list.size()-1;

        while(i<j){

            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;


        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("original list"+list);
        reverseArray(list);

        System.out.println("reversed list"+list);
    }

}
