import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

    public static String arrangeToFormLargestNumber(List<Integer> numbers) {
        List<String> strings = numbers.stream()
                                      .map(String::valueOf)
                                      .collect(Collectors.toList());

        Collections.sort(strings, (a, b) -> (b + a).compareTo(a + b));

        if (strings.get(0).equals("0")) {
            return "0";
        }

        return String.join("", strings);


    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 30, 34, 5, 9);

        String largestNumber = arrangeToFormLargestNumber(numbers);
        System.out.println("Largest Number: " + largestNumber);
    }
}