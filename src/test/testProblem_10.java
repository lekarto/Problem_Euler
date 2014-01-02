package test;

import Problems.Problem_10;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_10 {
    @Test
    public void testSolution_1() {
        long res = Problem_10.solution_1(Problem_10.inputValue());
        Assert.assertTrue(res == Problem_10.rightAnswer());
    }
}
