package Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class functionsLibrary {
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

    public static void deleteColums(String fileName) {
        // тут читай как хочешь, я свою функцию наваял для чтения из файла
        int matr[][] = readMatrixFromFile("matrix.txt");
        // тут берем размеры массива. У тебя это м = 8, н = 12
        int m = matr.length, n = matr[m-1].length;
        int i, j;
        boolean cond = false; // считаем, что удалять столбец не надо
        System.out.println("Matrix before:"); // простая печать строки
        // дальше просто печать исходного массива
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matr[i][j]+"  ");
            }
            System.out.println();
        }
        // ставим указатель на первый столбец. в Java нумерация как и в С - с нуля
        j = 0;
        while (j < n) { // пашем аки кони пока есть столбцы
            cond = false; // считаем, что столбец удалять не нужно
            for (i = 1; i < m/2; i++) { // цикл по первой половине массива
                if (matr[i][j] >= matr[i-1][j]) {
                    cond = true; // если условие не выполнилось значит в первой половине столбца элементы идут не по убыванию
                    break; // а если есть хоть одно несовпадение - значит можно дальне не проверять, потому валим из этого гиблого столбца
                }
            }
            // если первую половину столбца проверили и он идет по убыванию - проверяем вторую
            if (!cond) {
                for (i = m-1; i > m/2; i--) {
                    if (matr[i][j] <= matr[i-1][j]) {
                        cond = true; // если условие не выполнилось значит в первой половине столбца элементы идут не по возрастанию
                        break;
                    }
                }
            }
            if (!cond) { // если false - столбец нормальный и нужно просто нарастить счетчик столбца
                j++;
            } else { // тут удаляем столбец
                if ((j +1) < n) { // если условие выполняется - удалять нечего, это последний столбец
                    for (int k = j; k < n-1; k++) { // цикл по оставшимся столбцам
                        for (i = 0; i < m; i++) { // цикл по строкам: переписываем из соседнего столбца элементы
                            matr[i][k] = matr[i][k+1];
                        }
                    }
                }
                n--; // обязательно уменьшаем счетчик столбцов при этом не наращивая бегунок по столбцу т.к. на текущее место стал непроверенный столбец
            }

        }
        // ну и дальше хвастаемся что у нас получилось :-)
        System.out.println("Matrix after:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matr[i][j]+"  ");
            }
            System.out.println();
        }
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


}
