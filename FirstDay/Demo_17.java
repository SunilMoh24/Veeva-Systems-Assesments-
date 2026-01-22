import java.util.*;
import java.util.stream.Collectors;

public class Demo_17{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "Apple", "orange", "banana");
        List<String> result = list.stream().map(String::toUpperCase).distinct().sorted().collect(Collectors.toList());
        System.out.println(result);
    }

}
