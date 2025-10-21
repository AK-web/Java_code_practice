package Java_8.String;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class NonRepetingChar {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","a","d","c");

        List<String> res = list.stream()
                .filter(c -> Collections.frequency(list,c)==1)
                .toList();
        System.out.println(res);
    }
}
