package Problems;

public class Problem_12 {

    public static long solution_1(int begTriangleValue, int begTriangleNo) {
        int triangleNo = begTriangleNo;
        long triangleValue = begTriangleValue;
        while (functions.countOfDivisor(triangleValue) < 500) {
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
