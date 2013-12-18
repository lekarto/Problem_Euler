package Problems;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 18.12.13
 * Time: 13:23
 * To change this template use File | Settings | File Templates.
 */

// Right answer: 233168

public class Problem_1 {
    public static void solution_1() {
        long j, result = 0;
        for (j = 1; j < 1000; j++) {
            if (((j % 3) == 0) || ((j % 5) ==0) ) {
                result += j;
            }
        }
        System.out.println("Result: " + result);
    }

    public static void solution_2() {
        long i = 0, j = 0, result = 0;
        boolean cond = true;
        result = 0;
        cond = true;
        j = 1;
        while (cond) {
            result += j*3;
            j++;
            cond = (((j*3) < 1000) );
        }
        cond = true;
        j = 1;
        while (cond) {
            result += j*5;
            j++;
            cond = (((j*5) < 1000) );
        }
        System.out.println("Result: " + result);
    }
}