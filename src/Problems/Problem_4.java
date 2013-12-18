package Problems;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 18.12.13
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */

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

    public static void solution_1() {
        for (int i = 999; i > 900; i--) {
            for (int j = 999; j > 900; j--) {
                if (isPolindrome(i*j)) {
                    System.out.println("Polindrome: " + i*j);
                    return;
                }
            }
        }
    }
}
