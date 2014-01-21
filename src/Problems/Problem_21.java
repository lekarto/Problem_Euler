package Problems;

public class Problem_21 {
    private static int sumOfDivisors(int val) {
        int sum = 1;
        for (int i = 2; i <= val/2; i++) {
            if ((val % i) == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static Boolean isAmbicable(int value) {
        boolean isAmbicable = false;
        int sumDivisorsVal = sumOfDivisors(value);
        if (value == sumDivisorsVal) {
            return isAmbicable;
        }
        int sumDivisorsValExt = sumOfDivisors(sumDivisorsVal);
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
