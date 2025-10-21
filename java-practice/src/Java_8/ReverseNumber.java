package Java_8;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;

        int reversed = Integer.parseInt(
                new StringBuilder(String.valueOf(num))
                        .reverse()
                        .toString()
        );

        System.out.println(reversed);

        System.out.println("------------------");
        int nums = 12345;
        int reverse = 0;

        while (nums != 0) {
            int digit = nums % 10;
            reverse = reverse * 10 + digit;
            nums = nums / 10;
        }
        System.out.println(reverse);
    }
}
