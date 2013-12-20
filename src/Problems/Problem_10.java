package Problems;

import java.io.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 20.12.13
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */

// Right answer: 142913828922

public class Problem_10 {
    public static void solution_1() {
        long sum = 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(primes.size(), 2);
        for (int i = 3; i <= 2000000; i += 2) {
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
    }
}
