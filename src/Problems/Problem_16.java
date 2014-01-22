package Problems;

import java.math.BigInteger;

public class Problem_16 {
    public static long solution_1(int value) {
        BigInteger val = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            val = val.multiply(BigInteger.valueOf(2));
        }
        String str = String.valueOf(val);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(Character.toString(str.charAt(i))) ;
        }
        System.out.println(sum);
        return sum;
    }

    public static long rigthAnswer() {
        return 1366;
    }

    public static int inputValue() {
        return 1000;
    }

}
