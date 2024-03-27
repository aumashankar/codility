package iterations;

public class TrianglePattern {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print asterisks
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

