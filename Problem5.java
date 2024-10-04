import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    public static void findCombinations(String sequence, int sum, String combination, int nextNum) {
        if (nextNum > 9) {
            if (sum == 100) {
                System.out.println(combination);
            }
            return;
        }

        findCombinations(sequence + nextNum, sum + nextNum, combination + "+" + nextNum, nextNum + 1);

        findCombinations(sequence + nextNum, sum - nextNum, combination + "-" + nextNum, nextNum + 1);

        findCombinations(sequence + nextNum, sum, combination, 10 * nextNum);
    }

    public static void main(String[] args) {
        findCombinations("1", 1, "1", 2);
    }
}