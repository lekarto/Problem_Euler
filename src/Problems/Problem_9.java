package Problems;

// Right answer: 31875000

public class Problem_9 {
    public static long solution_1() {
        long res = -1;

        for (int a = 1; a <= 333; a++) {
            for (int b = a+1; b <= 499; b++) {
                int c = 1000 - a - b;
                if ((a*a + b*b) == (c*c)) {
                    res = a*b*c;
                    System.out.println(res);
                    return res;
                }
            }
        }
        return res;
    }

    public static long rightAnswer() {
        return 31875000;
    }
}
