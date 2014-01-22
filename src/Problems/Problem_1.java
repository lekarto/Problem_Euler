package Problems;

public class Problem_1 {
    public static long solution_1(int upperValue) {
        long j, result = 0;
        for (j = 1; j < upperValue; j++) {
            if (((j % 3) == 0) || ((j % 5) ==0) ) {
                result += j;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int inputValue() {
        return 1000;
    }

    public static long rightAnswer() {
        return 233168;
    }
}