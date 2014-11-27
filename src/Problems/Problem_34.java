package Problems;

public class Problem_34 {
    public static void solution_1() {
        int result = 0;
        for (int i = 11; i <= 9999999; i++) {
            long sum = 0;
            int j = i;
            while (j > 0) {
                sum += functions.factBetweenZeroToNine(j % 10);
                j = (j - j % 10) / 10;
            }
            if (sum == i) {
                result += i;
                System.out.println(i);
            }
        }
        System.out.println(result);
    }
}
