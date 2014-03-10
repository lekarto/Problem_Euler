package Problems;

public class Problem_30 {
    private static long digitsInPow(int digit, int pow) {
        long sum = 0;
        String dig = Integer.toString(digit);

        for (int i = 0; i < dig.length(); i++) {
            sum += Math.pow(Character.getNumericValue(dig.charAt(i)), pow);
        }
        return sum;
    }

    public static long solution_1(int power) {
        long sum = 0;
        // верхний порог для 5 высчитал. А вот как - забыл хоть тресни.
        for (int i = 11; i < 1000000; i++) {
            if (digitsInPow(i, power) == i) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static long rightAnswer() {
        return 443839;
    }

    public static int inputValue() {
        return 5;
    }

}
