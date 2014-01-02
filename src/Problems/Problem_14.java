package Problems;

public class Problem_14 {
    public static long solution_1(int value) {
        long val = -1;
        int chainLength = 0, i = value;
        while (i > (value/2)) {
            int currentChainLength = 1;
            long currentVal = i;
            while (currentVal != 1) {
                if ((currentVal % 2) == 0) {
                    currentVal /= 2;
                } else {
                    currentVal = 3*currentVal + 1;
                }
                currentChainLength++;
            }
            if (currentChainLength > chainLength) {
                val = i;
                chainLength = currentChainLength;
            }
            i--;
        }
        System.out.println(val);
        return val;
    }

    public static long rigthAnswer() {
        return 837799;
    }

    public static int inputValue() {
        return 1000000;
    }
}
