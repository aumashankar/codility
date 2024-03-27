package iterations;

public class SimpleTriangle {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // Print asterisks for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

