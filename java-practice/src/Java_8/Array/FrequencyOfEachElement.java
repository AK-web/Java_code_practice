package Java_8.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};

        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }
}
