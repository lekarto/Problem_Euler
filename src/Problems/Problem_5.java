package Problems;

// Right answer: 232792560

public class Problem_5 {
    public static long solution_1(int greatestDivisor) {
        long i = greatestDivisor*2;
        boolean isDivide = false;
        while (!isDivide) {
            isDivide = true;
            for (int j = greatestDivisor; j > (greatestDivisor / 2); j--) {
                if ((i % j) != 0) {
                    isDivide = false;
                    break;
                }
            }
            if (!isDivide) {
                i++;
            } else {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("Min value if not find!");
        return -1;
    }

    public static int inputValue() {
        return 20;
    }

    public static long rightAnswer() {
        return 232792560;
    }
}
