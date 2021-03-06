package Problems;

import java.util.ArrayList;

public class Problem_10 {
    public static long solution_1(int highValue) {
        long sum = 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(primes.size(), 2);
        for (int i = 3; i <= highValue; i += 2) {
            if ((i > 10) && ((i % 10) == 5)) {
                continue;
            }
            int n = primes.size();
            boolean cond = false;
            for (int j = 0; j < n; j++) {
                int val = primes.get(j);
                if (((val*val - 1) > i) ) {
                    primes.add(primes.size(), i);
                    sum += i;
                    cond = true;
                    break;
                }
                if ((i % val) == 0) {
                    cond = true;
                    break;
                }
            }
            if (!cond) {
                primes.add(primes.size(), i);
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static long rightAnswer() {
        return 142913828922L;
    }

    public static int inputValue() {
        return 2000000;
    }
}
