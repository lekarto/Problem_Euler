package Problems;

//Right answer: 6857

public class Problem_3 {
    public static void solution_3() {
        long i = 2L;
        int n = 0, j;
        Long ar[] = new Long[100];

        long value = 600851475143L;
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
        System.out.println("-------------------------------");
        for (j = 0; j < n; j++) {
            System.out.println(ar[j]);
        }
    }
}