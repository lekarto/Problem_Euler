package test;

import Problems.Problem_16;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_16 {
    @Test
    public void testSolution_1() {
        long res = Problem_16.solution_1(Problem_16.inputValue());
        Assert.assertTrue(res == Problem_16.rigthAnswer());
    }
}
