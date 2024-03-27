package iterations;

public class DigitCounter {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int digitCount = countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }

    public static int countDigits(int n) {
        int count = 0;

        while (n != 0) {
            n /= 10; // Divide n by 10
            count++; // Increment the count for each division
        }

        return count;
    }
}

