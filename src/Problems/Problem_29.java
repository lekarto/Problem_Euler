package Problems;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem_29 {
    public static long solution_1(int base, int power) {
        ArrayList<BigInteger> nums = new ArrayList<BigInteger>();

        for (int a = 2; a <= base; a++) {
            for (int n = 2; n <= power; n++) {
                //long value = (long)Math.pow(a, n);
                BigInteger value = new BigInteger("1");
                for (int k = 1; k <= n; k++) {
                    value = value.multiply(BigInteger.valueOf(a));
                }
                if (nums.indexOf(value) < 0) {
                    nums.add(value);
                }
            }
        }
        System.out.println(nums.size());
        return nums.size();
    }

    public static int[] inputValue() {
        return new int[] {100, 100};
    }

    public static long rightAnswer() {
        return 9183;
    }
}
