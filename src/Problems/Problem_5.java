package Problems;

// Right answer: 232792560

public class Problem_5 {
    public static void solution_1() {
        long i = 40;
        boolean isDivide;
        while (i < 233792560) {
            isDivide = true;
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
