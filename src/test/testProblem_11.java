package test;

import Problems.Problem_11;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_11 {
    @Test
    public void testSolution_1() {
        long res = Problem_11.solution_1(Problem_11.inputValue());
        Assert.assertTrue(res == Problem_11.rightAnswer());
    }
}
