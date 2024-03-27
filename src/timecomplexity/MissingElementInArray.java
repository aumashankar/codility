package timecomplexity;

public class MissingElementInArray {
    public int solution(int[] A) {
        long N = A.length + 1; // Size of the array plus one, since one element is missing
        // Calculate the expected sum of all numbers from 1 to N (inclusive)
        long totalSum = N * (N + 1) / 2;

        // Calculate the sum of elements in the array
        long arraySum = 0;
        for (int number : A) {
            arraySum += number;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return (int)(totalSum - arraySum);
    }

    public static void main(String[] args) {
        MissingElementInArray solution = new MissingElementInArray();
        int[] A = {2, 3, 1, 5};
        System.out.println("The missing element is: " + solution.solution(A));
    }
}

