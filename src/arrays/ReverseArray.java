package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        // Convert array to a list
        java.util.List<Integer> list = Arrays.asList(array);

        // Reverse the list
        Collections.reverse(list);

        // Convert back to array if needed
        Integer[] reversedArray = list.toArray(new Integer[0]);

        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}

