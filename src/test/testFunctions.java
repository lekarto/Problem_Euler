package test;

import Problems.functions;
import junit.framework.Assert;
import org.junit.Test;

public class testFunctions {
    @Test
    public void testReverseAndConcatenate() {
        String testStr[] = {"asdf", "dfg", "asdc", "e"},
               resultStr = functions.reverseAndConcatenate(testStr);
        Assert.assertTrue(resultStr.equals("fdsa gfd cdsa e"));

        testStr = new String[] {"asdf", "zx cv", " q w e r ", "uiop", "h jkl", " df "};
        resultStr = functions.reverseAndConcatenate(testStr);
        Assert.assertTrue(resultStr.equals("fdsa vc xz  r e w q  poiu lkj h  fd "));
    }

    @Test
    public void testSumOfDivisors() {
        // 28 хорошее число. Сумма делителей числа 28 равна самому числу
        int res = functions.sumOfDivisors(28);
        Assert.assertTrue(28 == res);
    }

    @Test
    public void testCountOfDivisor() {
        long res = functions.countOfDivisor(1);
        Assert.assertTrue(res == 1);

        res = functions.countOfDivisor(12);
        Assert.assertTrue(res == 6);
    }

    @Test
    public void testIsAbundant() {
        Assert.assertTrue(functions.isAbundant(12));
        Assert.assertFalse(functions.isAbundant(15));
    }

    @Test
    public void testGetMax() {
        long data[] = {1, 7, -1, 3, 5};
        Assert.assertTrue(functions.getMax(data) == 7);
    }

    @Test
    public void testIsPolindrome() {
        Assert.assertFalse(functions.isPolindrome(65536));
        Assert.assertTrue(functions.isPolindrome(65556));
    }
}
