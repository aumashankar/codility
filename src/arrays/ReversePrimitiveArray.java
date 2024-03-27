package arrays;

import java.util.Arrays;

public class ReversePrimitiveArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println(Arrays.toString(array));

        // Manually reverse the array
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Print the reversed array
        System.out.println(Arrays.toString(array));
    }
}
