package Java_8.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] arr) {
        // Stream non-zero elements first, then zeros
        return IntStream.concat(
                Arrays.stream(arr).filter(num -> num == 0),
                Arrays.stream(arr).filter(num -> num != 0)
        ).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        int[] res = moveZerosToEnd(arr);

        System.out.println(Arrays.toString(res));
    }
}
