package iterations;

public class BinaryGap {
    public int solution(int N) {
        // Convert to binary string
        String binaryString = Integer.toBinaryString(N);

        // Initialize variables to track the maximum gap length and the current gap length
        int maxGap = 0;
        int currentGap = 0;

        // Iterate over the binary string
        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                // If the character is '0', increment the current gap length
                currentGap++;
            } else {
                // If the character is '1', update the maximum gap length if necessary
                // and reset the current gap length
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }
        }

        // Return the maximum gap length found
        return maxGap;
    }

    public static void main(String[] args) {
        BinaryGap solution = new BinaryGap();

        // Example tests
        int test1 = 1041; // Expected output: 5
        System.out.println("The longest binary gap of " + test1 + " is: " + solution.solution(test1));

        int test2 = 3; // Expected output: 0
        System.out.println("The longest binary gap of " + test2 + " is: " + solution.solution(test2));
    }
}

