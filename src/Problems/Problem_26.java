package Problems;

public class Problem_26 {
    private static int recurringCount(int value) {
        int result = 1;
        int l = 0, r = 1, c;
        //инвариант: r/n = результат отбрасывания l знаков в 1/n
        while(l != value + 1) {
            r = (10 * r) % value;
            l++;
        }
        c = r;
        //c = (n+1)-ый член последовательности остатков
        r = (10 * r) % value;
        //r = (n+k+1)-ый член последовательности остатков
        while (r != c) {
            r = (10 * r) % value;
            result++;
        }
        return result;
    }


    public static long solution_1(int maxValue) {
        int maxPeriod = 0, value = 0;
        for (int i = 1; i <= maxValue; i++) {
            int b = recurringCount(i);
            if (b > maxPeriod) {
                maxPeriod = b;
                value = i;
            }
        }
        System.out.print(value);
        return value;
    }

    public static long rightAnswer() {
        return 983;
    }

    public static int inputValue() {
        return 1000;
    }
}
