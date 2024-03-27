package timecomplexity;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        // Calculate the total distance to be covered
        int distance = Y - X;

        // Calculate the number of jumps. If there's a remainder, add an extra jump.
        int jumps = distance / D;
        if (distance % D != 0) {
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();

        // Test the solution
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println("The minimal number of jumps: " + frogJump.solution(X, Y, D));
    }
}

