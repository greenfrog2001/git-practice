import java.util.Scanner;

public class FibonacciNumbers_GF {
    public static int FibonacciNumbers (int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return FibonacciNumbers(n-1) + FibonacciNumbers(n-2);
        }
    }
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        int result = FibonacciNumbers(n);
    }
}
