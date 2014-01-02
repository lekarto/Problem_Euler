package test;

import Problems.Problem_13;
import junit.framework.Assert;
import org.junit.Test;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class testProblem_13 {
    @Test
    // Проверяем общее решение на правильный ответ
    public void testSolution_1() {
        long res = Problem_13.solution_1(Problem_13.inputValue("problem_12.txt"));
        Assert.assertTrue(res == Problem_13.rightAnswer());
    }

    @Test
    // проверяем решение на тестовых данных
    public void test2Solution_1() {
        if (createTestFile("test.txt")) {
            long res = Problem_13.solution_1(Problem_13.inputValue("test.txt"));
            File fl = new File("test.txt");
            fl.deleteOnExit();
            Assert.assertTrue(res == 9999999999L);
        } else {
            Assert.fail();
        }
    }

    @Test
    // Проверяем как запись и чтение в/из файла выполняется
    public void testInputValue() {

        if (createTestFile("test.txt")) {
            ArrayList<BigInteger> rigthAr = new ArrayList<BigInteger>();
            for (int i = 1; i < 10; i++) {
                rigthAr.add(BigInteger.valueOf(1111111111));
            }
            ArrayList<BigInteger> testAr;
            testAr = Problem_13.inputValue("test.txt");
            File fl = new File("test.txt");
            fl.deleteOnExit();
            Assert.assertEquals(rigthAr, testAr);
        } else {
            Assert.fail();
        }
    }

    //  Создаем файл с тестовыми данными
    private static boolean createTestFile(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
            for (int i = 1; i < 10; i++) {
                out.println("1111111111");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
