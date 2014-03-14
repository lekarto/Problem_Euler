package test;

import Problems.Problem_15;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_15 {
    @Test
    public void testSolution_1() {
        int ar[] = Problem_15.inputValue();
        long res = Problem_15.solution_1(ar[0], ar[1]);
        Assert.assertTrue(res == Problem_15.rightAnswer());
    }

    @Test
    public void testSolution_1_2x2() {
        // from Problem 15
        long res = Problem_15.solution_1(2, 2);
        Assert.assertTrue(res == 6);
    }
}
