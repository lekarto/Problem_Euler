package Problems;

public class Problem_28 {
    public static long solution_1(int matrixSize) {
        long sum = 1;
        long elNorthEast = 1, // северо-восток
             elNorthWest = 1, // северо-запад
             elSouthEast = 1, // юго-восток
             elSouthWest = 1; // юго-запад
        for (int i = 1; i <= matrixSize/2; i++) {
            // северо-западное направление
            elNorthWest += 6 + 8*(i-1);
            // северо-восточное
            elNorthEast += 8*i;
            // юго-восточное
            elSouthEast += 2*(4*(i-1)+1);
            // юго-западное
            elSouthWest += 4*(2*i-1);
            sum += elNorthWest + elNorthEast + elSouthEast + elSouthWest;
        }
        System.out.println(sum);
        return sum;
    }

    public static int inputValue() {
        return 1001;
    }

    public static long rightAnswer() {
        return 669171001;
    }
}
