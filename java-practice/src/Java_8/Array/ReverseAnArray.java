package Java_8.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] reversed = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1])
                .toArray();

        System.out.println(Arrays.toString(reversed));

        System.out.println("--------------------");

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
}
