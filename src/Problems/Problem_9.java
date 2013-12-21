package Problems;

// Right answer: 31875000

public class Problem_9 {
    public static void solution_1() {
        //int a, b, c;

        for (int a = 1; a <= 333; a++) {
            for (int b = a+1; b <= 499; b++) {
                int c = 1000 - a - b;
                if ((a*a + b*b) == (c*c)) {
                    System.out.println(a*b*c);
                }
            }
        }
    }
}
