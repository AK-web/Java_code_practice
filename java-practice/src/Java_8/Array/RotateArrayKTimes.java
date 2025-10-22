package Java_8.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RotateArrayKTimes {
    public static void rotate(int[] arr, int k) {
        // Convert to list for easy rotation
        List<Integer> list = new ArrayList<>();
        for (int num : arr)
            list.add(num);

        // Rotate using built-in method
        Collections.rotate(list, k);

        // Copy back to array
        for (int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated:  " + Arrays.toString(arr));
    }
}
