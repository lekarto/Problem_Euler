package Problems;

public class Problem_21 {

    private static Boolean isAmbicable(int value) {
        boolean isAmbicable = false;
        int sumDivisorsVal = functions.sumOfDivisors(value);
        if (value == sumDivisorsVal) {
            return isAmbicable;
        }
        int sumDivisorsValExt = functions.sumOfDivisors(sumDivisorsVal);
        if (sumDivisorsValExt == value) {
            isAmbicable = true;
        }
        return isAmbicable;
    }

    public static long solution_1(int maxValue) {
        long sum = 0;
        for (int i = 1 ; i <= maxValue; i++) {
            if (isAmbicable(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static long rightAnswer() {
        return 31626;
    }

    public static int inputValue() {
        return 10000;
    }
}
