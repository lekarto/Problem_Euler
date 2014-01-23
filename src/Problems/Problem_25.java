package Problems;

import java.math.BigInteger;

public class Problem_25 {
    public static long solution_1(int lengthFibonacciNumber) {
        BigInteger n_2, n_1 = new BigInteger("1"),
                   current = new BigInteger("2");
        int term = 3;
        while (current.toString().length() < lengthFibonacciNumber) {
            n_2 = n_1;
            n_1 = current;
            current = new BigInteger(n_2.toString()).add(n_1);
            term++;
        }
        System.out.println(term);
        return term;
    }

    public static long rightAnswer() {
        return 4782;
    }

    public static int inputValue() {
        return 1000;
    }
}
