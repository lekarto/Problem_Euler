package Problems;

//Right answer: 6857

public class Problem_3 {
    public static long solution_1(long num) {
        long i = 2L;
        int n = 0, j;
        Long ar[] = new Long[100];

        long value = num;
        while (i < Math.sqrt(value)) {
            if ((value % i) == 0) {
                value /= i;
                //n++;
                ar[n++] = i;
                i = 2;
            } else {
                i++;
            }

        }
        ar[n++] = value;
        //System.out.println("-------------------------------");
        /*for (j = 0; j < n; j++) {
            System.out.println(ar[j]);
        }*/
        return ar[n-1];
    }

    public static long inputValue() {
        return 600851475143L;
    }

    public static long rightAnswer() {
        return 6857;
    }
}