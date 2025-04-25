public class SwapWithoutThirdVar {


    static void swap(int a, int b) {
        System.out.println("original number");
        System.out.println("a:" + a);
        System.out.println("b:" + b);


        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Values after swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

    public static void main(String[] args) {


        int a = 3;
        int b = 8;

        swap(a, b);


    }

}