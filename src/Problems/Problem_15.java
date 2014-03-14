package Problems;

public class Problem_15 {
    public static long solution_1(int rowCount, int colCount) {
        int m = rowCount + 1, n = colCount + 1;
        long [][]matr = new long[m][n];
        matr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i-1) >= 0)
                    matr[i][j] += matr[i-1][j];
                if ((j-1) >= 0)
                    matr[i][j] += matr[i][j-1];
            }
        }
        System.out.println(matr[m-1][n-1]);
        return matr[m-1][n-1];
    }

    public static long rightAnswer() {
        return 137846528820L;
    }

    public static int[] inputValue() {
        int ar[] = new int[2];
        ar[0] = 20; ar[1] = 20;
        return ar;
    }
}
