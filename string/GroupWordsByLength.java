package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static void main(String[] args) {
        String str = "i have a string word for program";

        Map<Integer, List<String>> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

    }


}
