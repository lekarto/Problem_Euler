package Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem_67 {
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

    public static long solution_1() {
        long sum = 0;
        int [][]matr = readMatrixFromFile("problem_67.txt");
        if (matr.length == 0) return sum;
        for (int i = matr.length-2; i >= 0; i--) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] += Math.max(matr[i+1][j], matr[i+1][j+1]);
            }
        }
        System.out.println(matr[0][0]);
        return matr[0][0];
    }

    public static long rightAnswer() {
        return 7273;
    }
}