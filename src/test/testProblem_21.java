package test;

import Problems.Problem_21;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_21 {
    @Test
    public void testSolution_1() {
        long res = Problem_21.solution_1(Problem_21.inputValue());
        Assert.assertTrue(res == Problem_21.rightAnswer());
    }

    @Test
    public void testSolution1_with_220() {
        Assert.assertTrue(Problem_21.solution_1(220) == 220);
    }
}
