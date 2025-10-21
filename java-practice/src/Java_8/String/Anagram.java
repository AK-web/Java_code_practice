package Java_8.String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "liste";

        boolean res = Arrays.equals(str1.toLowerCase().chars().sorted().toArray()
                , str2.toLowerCase().chars().sorted().toArray());
        System.out.println(res);
    }
}
