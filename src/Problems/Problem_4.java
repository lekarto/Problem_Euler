package Problems;

// Right answer: 906609

public class Problem_4 {
    private static boolean isPolindrome(long value) {
        long res =0, input = value;
        while (input > 0) {
            res = res*10 + (input % 10);
            input = (input/10);
        }
        return (res == value);
    }

    public static long solution_1(int maxValue) {
        for (int i = maxValue; i > (maxValue - 0.1*maxValue); i--) {
            for (int j = maxValue; j > (maxValue - 0.1*maxValue); j--) {
                if (isPolindrome(i*j)) {
                    System.out.println(i*j);
                    return i*j;
                }
            }
        }
        return -1;
    }

    public static long rightAnswer() {
        return 906609;
    }

    public static int inputValue() {
        return 999;
    }
}