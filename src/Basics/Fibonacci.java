package Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {

            int next = a + b;
            a = b;
            b =  next;

            System.out.print(next + " ");
        }
    }
}
//public class Fibonacci {
//    // Recursive method to calculate the nth Fibonacci number
//    public static int fibonacci(int n) {
//        if (n == 0) {
//            return 0; // Base case: 0th Fibonacci number is 0
//        } else if (n == 1) {
//            return 1; // Base case: 1st Fibonacci number is 1
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
//    }
//
//    public static void main(String[] args) {
//        int n = 10; // Number of terms in the Fibonacci series
//        System.out.println("Fibonacci series up to " + n + " terms:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//}
