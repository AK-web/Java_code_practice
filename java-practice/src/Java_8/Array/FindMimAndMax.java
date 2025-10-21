package Java_8.Array;

import java.util.Arrays;

public class FindMimAndMax {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 2, 9};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Max: " + max + ", Min: " + min);
    }
}
