package Java_8.Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] unique = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(unique));
    }
}
