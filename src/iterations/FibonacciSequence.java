package iterations;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 100; // Example limit
        printFibonacciNumbers(n);
    }

    public static void printFibonacciNumbers(int n) {
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number

        while (a <= n) {
            System.out.print(a + " ");
            int nextFibonacci = a + b;
            a = b; // Update the last Fibonacci number to the second last
            b = nextFibonacci; // Update the last Fibonacci number to the new one
        }
    }
}

