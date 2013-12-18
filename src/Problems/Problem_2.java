package Problems;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 18.12.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */

// Right answer: 4613732

public class Problem_2 {
    public static void solution_1() {
        long pre_prev = 1, prev = 2, next = 1,  sum = 0;
        sum = prev;
        while ((next = pre_prev + prev) < 4000000) {
            pre_prev = prev;
            prev = next;
            if ((next % 2) == 0) {
                sum += next;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
