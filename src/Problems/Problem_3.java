package Problems;

public class Problem_3 {
    public static long solution_1(long num) {
        long i = 2L;
        int n = 0;
        Long ar[] = new Long[100];

        long value = num;
        while (i < Math.sqrt(value)) {
            if ((value % i) == 0) {
                value /= i;
                ar[n++] = i;
                i = 2;
            } else {
                i++;
            }

        }
        ar[n++] = value;
        return ar[n-1];
    }

    public static long inputValue() {
        return 600851475143L;
    }

    public static long rightAnswer() {
        return 6857;
    }
}