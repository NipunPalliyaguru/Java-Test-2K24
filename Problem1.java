import java.util.Arrays;
import java.util.List;

public class Problem1 {

    // Using for-loop
    public static int sumUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {


            sum += num;
        }
        return sum;
    }

    // Using while-loop
    public static int sumUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;

        int i = 0;

        while (i < numbers.size()) {

            sum += numbers.get(i);

            i++;
        }
        return sum;
    }

    // Using recursion
    public static int sumUsingRecursion(List<Integer> numbers) {
        return sumRecursion(numbers, 0);
    }

    private static int sumRecursion(List<Integer> numbers, int index) {
        if (index == numbers.size()) {



            return 0;
        }
        return numbers.get(index) + sumRecursion(numbers, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        int sum = sumUsingForLoop(numbers);
        System.out.println("Sum using for-loop: " + sum);


        sum = sumUsingWhileLoop(numbers);
        System.out.println("Sum using while-loop: " + sum);


        sum = sumUsingRecursion(numbers);
        System.out.println("Sum using recursion: " + sum);
    }
}
