package Problems;

public class Problem_58 {
    public static long solution_1(double percent) {
        long i = 0;
        long prime = 0, allNums = 1;
        long elNorthEast = 1, // северо-восток
             elNorthWest = 1, // северо-запад
             elSouthEast = 1, // юго-восток
             elSouthWest = 1; // юго-запад
        do {
            i++;
            elNorthWest += 4*(2*i-1);
            elNorthEast += 2*(4*(i-1)+1);
            elSouthEast += 8*i;//
            elSouthWest += 6 + 8*(i-1);
            if (functions.countOfDivisor(elNorthWest) == 2) {
                prime++;
            }
            if (functions.countOfDivisor(elNorthEast) == 2) {
                prime++;
            }
            if (functions.countOfDivisor(elSouthEast) == 2) {
                prime++;
            }
            if (functions.countOfDivisor(elSouthWest) == 2) {
                prime++;
            }
            allNums += 4;
        } while ((1.*prime/allNums) > percent);
        i = i*2+1;
        System.out.println(i);
        return i;
    }

    public static long rightAnswer() {
        return 26241;
    }

    public static double inputValue() {
        return 0.1;
    }
}
