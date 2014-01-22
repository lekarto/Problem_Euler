package Problems;

import java.util.ArrayList;

public class Problem_23 {

    private static boolean isCanWrittenAsSumOfThoAbundant(int value, ArrayList<Integer> abudants) {
        for (int i = 0; i < abudants.size(); i++) {
            if (abudants.indexOf(new Integer(value - abudants.get(i))) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static long solution_1() {
        ArrayList<Integer> abundants = new ArrayList<Integer>();
        long sum = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!isCanWrittenAsSumOfThoAbundant(i, abundants)) {
                sum += i;
            }
            if (functions.isAbundant(i)) {
                abundants.add(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static long rightAnswer() {
        return 4179871;
    }
}
