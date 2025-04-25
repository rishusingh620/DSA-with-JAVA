import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = sc.next(); // Use sc.next() to read a single word (token)
        System.out.println("Name is: " + name);

        // Prompt the user for their lucky number
        System.out.print("Enter lucky number: ");
        int num_1 = sc.nextInt(); // Read an integer input
        System.out.println("Lucky number: " + num_1);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
