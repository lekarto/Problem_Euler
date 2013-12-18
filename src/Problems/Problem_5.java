package Problems;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 18.12.13
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */
public class Problem_5 {
    public static void solution_1() {
        long i = 40;
        boolean isDivide;
        while (i < 233792560) {
            isDivide = true;
            //System.out.println(i);
            for (int j = 20; j > 10; j--) { // 468 ms.
                if ((i % j) != 0) {
                    isDivide = false;
                    break;
                }
            }
            if (!isDivide) {
                i++;
            } else {
                System.out.println("Min value: " + i);
                return;
            }
        }
        System.out.println("Min value if not find!");
        return;
    }
}
