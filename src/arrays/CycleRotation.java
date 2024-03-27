package arrays;

import java.util.Arrays;

class CycleRotation {
    public int[] solution(int[] A, int K) {
        if (A == null || A.length <= 1) {
            return A; // No rotation needed for empty or single-element arrays
        }

        int length = A.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            // Calculate new position for each element after K rotations
            int newPosition = (i + K) % length;
            rotatedArray[newPosition] = A[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        CycleRotation cycleRotation = new CycleRotation();

        // Test example 1
        int[] A1 = {3, 8, 9, 7, 6};
        int K1 = 3;
        System.out.println(Arrays.toString(cycleRotation.solution(A1, K1))); // Expected: [9, 7, 6, 3, 8]

        // Test example 2
        int[] A2 = {0, 0, 0};
        int K2 = 1;
        System.out.println(Arrays.toString(cycleRotation.solution(A2, K2))); // Expected: [0, 0, 0]

        // Test example 3
        int[] A3 = {1, 2, 3, 4};
        int K3 = 4;
        System.out.println(Arrays.toString(cycleRotation.solution(A3, K3))); // Expected: [1, 2, 3, 4]
    }
}

