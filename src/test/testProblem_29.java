package test;

import Problems.Problem_29;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_29 {
    @Test
    public void testSolution_1() {
        int[] input = Problem_29.inputValue();
        long res = Problem_29.solution_1(input[0], input[1]);
        Assert.assertTrue(res == Problem_29.rightAnswer());
    }

    @Test
    public void testSolution_1_base5_power5() {
        long res = Problem_29.solution_1(5, 5);
        Assert.assertTrue(res == 15);
    }
}
