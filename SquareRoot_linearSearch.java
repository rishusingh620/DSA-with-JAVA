public class SquareRoot_linearSearch {

    static int findRoot(int x) {
        int y;
        for(y = 0; y * y <= x; ++y) {
        }
        return y - 1;
    }

    public static void main(String[] args) {
        int x = 16;
        System.out.println(findRoot(x));
    }
} 
    

