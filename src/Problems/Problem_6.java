package Problems;

// Right answer: 25164150

public class Problem_6 {
    public static void solution_1() {
        long sum_square = 0, square_sum = 0, res = 0;
        for (int i = 1; i <= 100; i++) {
            sum_square += Math.pow(i, 2);
            square_sum += i;
        }
        res = square_sum*square_sum - sum_square;
        System.out.println("Difference: " + res);
    }
}
