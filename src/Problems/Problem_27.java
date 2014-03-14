package Problems;

public class Problem_27 {
    public static void solution_1() {
        int maxPrimeCount = 0;
        int maxMul = 0;
        for (int b = 0; b <= 1000; b++) {
            //System.out.println("b = " + b);
            for (int a = 0; a <= 1000; a++) {
                //System.out.println("a = " + a);
                int primeCount = 0;
                for (int n = 0; n <= b; n++) {
                    //System.out.println("n = " + n);
                    int []a1 = {a, a, -a, -a};
                    int []b1 = {b, -b, b, -b};
                    for (int i = 0; i < a1.length; i++) {
                        int countOfDivisor = functions.countOfDivisor(n*n+a1[i]*n+b1[i]);
                        if (countOfDivisor == 2) {
                            primeCount++;
                        }
                    }
                }
                if (primeCount > maxPrimeCount) {
                    maxPrimeCount = primeCount;
                    maxMul = a*b;
                }
            }
        }
        System.out.println("mul: " + maxMul);
        System.out.println("primeCount: " + maxPrimeCount);

    }
}
