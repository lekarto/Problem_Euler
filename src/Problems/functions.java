package Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class functions {
    private static int fileLineCount(String fileName) {
        int lineCount = 0;
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    if (s.length() > 0) {
                        lineCount++;
                    }
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount;
    }
    private static int[][] readMatrixFromFile(String fileName) {
        int m = fileLineCount(fileName);
        int [][]matr = new int[m][m];

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                //В цикле построчно считываем файл
                String s;
                String []val;
                int lineNum = 0;
                while ((s = in.readLine()) != null) {
                    val = s.split("\\s+");
                    if (val.length > 0) {
                        lineNum++;
                        matr[lineNum-1] = new int[val.length];
                        for (int i = 0; i < val.length; i++) {
                            matr[lineNum-1][i] = Integer.valueOf(val[i]);
                        }
                    }
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matr;
    }

    public static String reverseAndConcatenate(String[] words) {
        String res = "";
        for (String str : words) {
            res = res + " " + new StringBuffer(str).reverse().toString();
        }
        if (res.length() > 0) {
            res = res.substring(1);
        }
        return res;
    }

    public static int sumOfDivisors(int val) {
        int sum = 1;
        for (int i = 2; i <= val/2; i++) {
            if ((val % i) == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int countOfDivisor(long value) {
        if (value == 0) {
            return 0;
        }
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

    public static boolean isAbundant(int value) {
        return (functions.sumOfDivisors(value) > value);
    }

    public static long getMax(long []ar) {
        if (ar.length == 0) {
            return Long.MIN_VALUE;
        }
        long max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    public static boolean isPolindrome(long value) {
        long res =0, input = value;
        while (input > 0) {
            res = res*10 + (input % 10);
            input = (input/10);
        }
        return (res == value);
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        if (n < 0) return -1;
        return n * factorial(n-1);
    }

    public static long factBetweenZeroToNine(int n) {
        switch (n) {
            case 0: return 1;
            case 1: return 1;
            case 2: return 2;
            case 3: return 6;
            case 4: return 24;
            case 5: return 120;
            case 6: return 720;
            case 7: return 5040;
            case 8: return 40320;
            case 9: return 362880;
            default: return 0;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
