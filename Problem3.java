import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public static List<BigInteger> generateFibonacciNumbers(int n) {

        List<BigInteger> fibonacciNumbers = new ArrayList<>();

        BigInteger a = BigInteger.ZERO;

        BigInteger b = BigInteger.ONE;

        fibonacciNumbers.add(a);
        fibonacciNumbers.add(b);
        
        for (int i = 2; i < n; i++) {
            BigInteger next = a.add(b);


            fibonacciNumbers.add(next);

            a = b;
            b = next;
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        int n = 10; 
        List<BigInteger> fibonacciNumbers = generateFibonacciNumbers(n);


        System.out.println("Fibonacci Numbers:");
        for (BigInteger number : fibonacciNumbers) {

            System.out.println(number);
        }
    }
}