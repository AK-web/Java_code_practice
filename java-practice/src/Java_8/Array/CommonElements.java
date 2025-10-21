package Java_8.Array;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        int[] common = Arrays.stream(a)
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
                .toArray();

        System.out.println(Arrays.toString(common));
    }
}
