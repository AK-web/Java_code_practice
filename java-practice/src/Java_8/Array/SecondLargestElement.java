package Java_8.Array;

import java.util.Arrays;


public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int res = Arrays.stream(arr)
                .boxed()
                .sorted((a,b) -> b-a)
                .skip(1)
                .findFirst().get();
        System.out.println(res);

        Arrays.sort(arr);
        int sol = arr[arr.length-3];
        System.out.println(sol);

        Arrays.sort(arr);
        int sol2 = arr[arr.length-4];
        System.out.println(sol2);
    }
}
