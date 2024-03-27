package timecomplexity;

public class TotalofNatualIntegers {
    /**
     *
     *  O(n^2)
     */
    public static int slowSolution(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += 1;
            }
        }
        return result;
    }

    /**
     *  O(n)
     */
    public static int fastSolution(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (i + 1);
        }
        return result;
    }

    /**
     *  O(1)
     */
    public static int mostEfficientSolution(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 100; // Example input

        System.out.println("Slow Solution Result: " + slowSolution(n));
        System.out.println("Fast Solution Result: " + fastSolution(n));
        System.out.println("Most Efficient Solution Result: " + mostEfficientSolution(n));
    }

}
