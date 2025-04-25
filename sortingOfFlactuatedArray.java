

public class sortingOfFlactuatedArray {

    static void SortArray(int []num) {

        int n = num.length;

        int x = -1, y = -1;

        if (n <= 1) {
            return;
        }

        for (int i = 1; i < num.length; i++) {

            if (num[i - 1] > num[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        // Swap only if x and y are valid
        if (x != -1 && y != -1) {
            int temp = num[x];
            num[x] = num[y];
            num[y] = temp;
        }
    }

    static void display(int []num){

        for(int val:num){
            System.out.println(val+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] num={89,7,8,9,3};
              SortArray(num);
              display(num);
    }
}
