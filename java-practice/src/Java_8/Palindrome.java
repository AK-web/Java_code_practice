package Java_8;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mam";

        boolean res = str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
        System.out.println(res);
    }
}