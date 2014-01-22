package Problems;

public class Problem_4 {
    public static long solution_1(int maxValue) {
        for (int i = maxValue; i > (maxValue - 0.1*maxValue); i--) {
            for (int j = maxValue; j > (maxValue - 0.1*maxValue); j--) {
                if (functions.isPolindrome(i*j)) {
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