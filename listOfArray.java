
import java.util.ArrayList;

public class listOfArray {
    public static void main(String[] args) {
        // wrapper classes
        Integer in = Integer.valueOf(4);
        System.out.println(in);

        Float t = Float.valueOf(45);
        System.out.println(t);

        ArrayList<Integer> L1 = new ArrayList<>();

        // add new element
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L1.add(6);

        System.out.println();

        //get an element at index i
        System.out.println(L1.get(1));

        System.out.println(L1.get(3));

        //print with for loop

       for (int i = 0; i < L1.size(); i++) {
           System.out.println(L1.get(i));


            //printing the array list directly
            System.out.println(L1);

            //adding the array list directly

            L1.add(1, 100);
            System.out.println(L1);

            // modifying element at index i

            L1.set(1,10);
            System.out.println(L1);

           // remove an element at index i

           L1.remove(1);
           System.out.println(L1);

           // removing an element e

           L1.remove(Integer.valueOf(5));
           System.out.println(L1);

           // checking if element exist

           boolean ans= L1.contains(Integer.valueOf(3));
           System.out.println(L1);

           // if you don't specify class ,you can put anything inside L

           ArrayList l=new ArrayList();
           l.add("pqrs");
           l.add(1);
           System.out.println(l);

        }
    }

}