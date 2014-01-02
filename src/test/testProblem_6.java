package test;

import Problems.Problem_6;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_6 {
    @Test
    public void testSolution_1() {
        long res = Problem_6.solution_1(Problem_6.inputValue());
        Assert.assertTrue(res == Problem_6.rightAnswer());
    }
}
