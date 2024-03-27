package arrays;

public class OddOccurencesInArray {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            // XOR operation with each element
            unpaired ^= number;
        }
        return unpaired; // Returns the unpaired element
    }

    public static void main(String[] args) {
        OddOccurencesInArray unpaired = new OddOccurencesInArray();

        // Example test case
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println("The unpaired element is: " + unpaired.solution(A));

        // XOR operation
        System.out.println(7^7);
        System.out.println(0^7);
    }
}

