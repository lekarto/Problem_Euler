package Problems;

import java.math.BigInteger;

public class Problem_20 {
    public static long solution_1(int factorial) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= factorial; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String val = String.valueOf(fact);
        long sum = 0;
        for (int i = 0; i < val.length(); i++) {
            sum += Integer.valueOf(Character.toString(val.charAt(i)));
        }
        System.out.println(sum);
        return sum;
    }

    public static long rightAnswer() {
        return 648;
    }
    public static int inputValue() {
        return 100;
    }
}
