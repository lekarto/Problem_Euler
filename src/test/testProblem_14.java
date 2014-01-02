package test;

import Problems.Problem_14;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_14 {
    @Test
    public void testSolution_1() {
        long res = Problem_14.solution_1(Problem_14.inputValue());
        Assert.assertTrue(res == Problem_14.rigthAnswer());
    }
}
