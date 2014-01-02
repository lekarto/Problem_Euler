package Problems;

// Right answer: 76576500

public class Problem_12 {

    private static int countOfDivisor(long value) {
        long count = 1, k = 0, i;
        if ((value == 1) || (value == 2)) {
            return (int)value;
        }
        while ((value & 1) == 0) {
            k++;
            value >>= 1;
        }
        if (value == 1) {
            return (int)(k+1);
        } else {
            count += k;
        }
        for (i = 3; i*i <= value; i += 2) {
            k = 0;
            while ((value % i) == 0) {
                k++;
                value /= i;
            }
            count *= (k+1);
        }
        if (value > 1) {
            count <<= 1;
        }
        return (int)count;
    }

    public static long solution_1(int begTriangleValue, int begTriangleNo) {
        int triangleNo = begTriangleNo;
        long triangleValue = begTriangleValue;
        while (countOfDivisor(triangleValue) < 500) {
            triangleNo++;
            triangleValue += triangleNo;
        }
        System.out.println(triangleValue);
        return triangleValue;
    }

    public static long rightAnswer() {
        return 76576500;
    }

    public static int[] inputValue() {
        int []ar = {28, 7};
        return ar;
    }
}
