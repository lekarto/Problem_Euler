package Problems;

public class Problem_17 {
    public static long solution_1(int min, long max) {

        int one[] = {0,
                "one".length(),
                "two".length(),
                "three".length(),
                "four".length(),
                "five".length(),
                "six".length(),
                "seven".length(),
                "eight".length(),
                "nine".length()};
        int ten[] = {0,
                "ten".length(),
                "twenty".length(),
                "thirty".length(),
                "forty".length(),
                "fifty".length(),
                "sixty".length(),
                "seventy".length(),
                "eighty".length(),
                "ninety".length()};
        int secondTen[] = {0,
                "eleven".length(),
                "twelve".length(),
                "thirteen".length(),
                "fourteen".length(),
                "fifteen".length(),
                "sixteen".length(),
                "seventeen".length(),
                "eighteen".length(),
                "nineteen".length()};
        int hundreds[] = {0,
                "onehundred".length(),
                "twohundred".length(),
                "threehundred".length(),
                "fourhundred".length(),
                "fivehundred".length(),
                "sixhundred".length(),
                "sevenhundred".length(),
                "eighthundred".length(),
                "ninehundred".length()};
        int thousands[] = {0,
                "onethousand".length(),
                "twothousand".length(),
                "threethousand".length(),
                "fourthousand".length(),
                "fivethousand".length(),
                "sixthousand".length(),
                "seventhousand".length(),
                "eightthousand".length(),
                "ninethousand".length()};

        long countLetters = 0;

        for (int i = min; i <= max; i++) {
            int ones;
            int thousand = i / 1000;
            int hundred = (i-thousand*1000) / 100;
            int tens = (i - thousand*1000 - hundred*100);
            int buf = tens;
            if ((tens <= 19) && (tens > 10)) {
                countLetters += secondTen[tens-10];
                ones = 0;
                tens = 0;
            } else {
                ones = tens % 10;
                tens /= 10;
            }
            countLetters += thousands[thousand];
            countLetters += hundreds[hundred];
            countLetters += ten[tens];
            countLetters += one[ones];
            if ((buf > 0) && (hundred > 0)) {
                countLetters += "and".length();
            }
        }
        System.out.println(countLetters);
        return countLetters;
    }

    public static long rightAnswer() {
        return 21124;
    }

    public static int[] inputValue() {
        return new int[] {1, 1000};
    }
}
