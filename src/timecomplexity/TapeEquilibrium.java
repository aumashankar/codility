package timecomplexity;

public class TapeEquilibrium {
        public int solution(int[] A) {
            long totalSum = 0;
            for (int value : A) {
                totalSum += value;
            }

            long minDiff = Integer.MAX_VALUE;
            long firstPartSum = 0;
            for (int P = 0; P < A.length - 1; P++) {
                firstPartSum += A[P];
                long secondPartSum = totalSum - firstPartSum;
                long diff = Math.abs(firstPartSum - secondPartSum);
                minDiff = Math.min(minDiff, diff);
            }

            return (int) minDiff;
        }

        public static void main(String[] args) {
            TapeEquilibrium solution = new TapeEquilibrium();
            int[] A = {3, 1, 2, 4, 3};
            System.out.println("The minimal difference is: " + solution.solution(A));
        }
    }

