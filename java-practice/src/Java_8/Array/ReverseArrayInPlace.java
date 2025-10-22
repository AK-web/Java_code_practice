package Java_8.Array;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
