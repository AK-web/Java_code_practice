package Java_8.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfChars {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'b', 'c', 'a', 'd', 'b', 'a');

        Map<Character, Long> foc = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(foc);


    }
}
