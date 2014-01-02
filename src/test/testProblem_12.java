package test;

import Problems.Problem_12;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_12 {
    @Test
    public void testSolution_1() {
        int []ar = Problem_12.inputValue();
        long res = Problem_12.solution_1(ar[0], ar[1]);
        Assert.assertTrue(res == Problem_12.rightAnswer());
    }
}
