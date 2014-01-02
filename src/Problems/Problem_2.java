package Problems;

// Right answer: 4613732

public class Problem_2 {
    public static long solution_1(int upperLimit) {
        long pre_prev = 1, prev = 2, next = 1,  sum = 0;
        sum = prev;
        while ((next = pre_prev + prev) < upperLimit) {
            pre_prev = prev;
            prev = next;
            if ((next % 2) == 0) {
                sum += next;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int inputValue() {
        return 4000000;
    }
    public static long rightAnswer() {
        return 4613732;
    }
}
