package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayCreationJava8 {
    public static void main(String[] args) {
        // Generate an array of the first 10 even numbers
        int[] evenNumbers = IntStream.range(0, 20) // Generates numbers from 0 to 19
                .filter(n -> n % 2 == 0) // Keeps only even numbers
                .toArray(); // Converts the stream to an array

        // Print the generated array
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] numbersArray = list.toArray(new Integer[0]); // Convert list to array

        int[] numbers = new int[5]; // Creates an integer array of size 5

        int[] numbersArr = {1, 2, 3, 4, 5}; // Creates and initializes an integer array
        System.out.println();
        for(int i=0; i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }


    }
}

