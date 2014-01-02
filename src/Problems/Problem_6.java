package Problems;

// Right answer: 25164150

public class Problem_6 {
    public static long solution_1(int numOfNumbers) {
        long sum_square = 0, square_sum = 0, res;
        for (int i = 1; i <= numOfNumbers; i++) {
            sum_square += Math.pow(i, 2);
            square_sum += i;
        }
        res = square_sum*square_sum - sum_square;
        System.out.println(res);
        return res;
    }

    public static int inputValue() {
        return 100;
    }

    public static long rightAnswer() {
        return 25164150;
    }
}
