package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_32 {

    private static boolean isPandigital(int i, int j) {
        int a = i;
        int b = j;
        int r = a*b;
        Integer pan[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (a > 0) {
            int dig = a % 10;
            if (dig == 0)
                return false;
            pan[dig-1]++;
            if (pan[dig-1] > 1)
                return false;
            a /= 10;
        }
        while (b > 0) {
            int dig = b % 10;
            if (dig == 0)
                return false;
            pan[dig-1]++;
            if (pan[dig-1] > 1)
                return false;
            b /= 10;
        }
        while (r > 0) {
            int dig = r % 10;
            if (dig == 0)
                return false;
            pan[dig-1]++;
            if (pan[dig-1] > 1)
                return false;
            r /= 10;
        }
        return !Arrays.deepToString(pan).contains("0");
    }

    private static boolean isContainElement(List<Integer> ar, int elem) {
        for (int i : ar) {
            if (i == elem)
                return true;
        }
        return false;
    }

    public static int solution_1() {
        int sum = 0;
        int i = 1;
        List<Integer> products = new ArrayList<Integer>();
        while ((999999999 /i) >= i) {
            int j = i;
            while ((Integer.toString(i).length() +
                    Integer.toString(j).length() +
                    Integer.toString(i*j).length()) <= 9) {
                if (isPandigital(i, j) && !isContainElement(products, i*j)) {
                    sum += i*j;
                    products.add(i*j);
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
