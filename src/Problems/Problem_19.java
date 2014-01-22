package Problems;

public class Problem_19 {
    public static long solution_1(int year) {
        int daysInYear[] = {
                         31, // Jan
                         28, // Feb
                         31, // Mar
                         30, // Apr
                         31, // May
                         30, // Jun
                         31, // Jul
                         31, // Aug
                         30, // Sep
                         31, // Oct
                         30, // Now
                         31};  // Dec
        int sumOfDays = (365) % 7; // year 1990
        int sundayFirst = 0;
        for (int i = 1901; i <= year; i++) {
            for (int j =0; j < daysInYear.length; j++) {
                if (sumOfDays == 6) {
                    sundayFirst++;
                }
                if (((i % 4) == 0) && ((i % 100) != 0) && (j == 1)) {
                    sumOfDays++;
                }
                sumOfDays = (sumOfDays + daysInYear[j]) % 7;
            }
        }
        System.out.println(sundayFirst);
        return sundayFirst;
    }

    public static long rightAnswer() {
        return 171;
    }

    public static int inputValue() {
        return 2000;
    }
}
