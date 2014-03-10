package test;

import Problems.Problem_30;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_30 {
    @Test
    public void testSolution_1() {
        long res = Problem_30.solution_1(Problem_30.inputValue());
        Assert.assertTrue(res == Problem_30.rightAnswer());
    }
}
