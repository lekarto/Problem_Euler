package test;

import Problems.Problem_20;
import org.junit.Assert;
import org.junit.Test;

public class testProblem_20 {
    @Test
    public void testSolution_1() {
        long res = Problem_20.solution_1(Problem_20.inputValue());
        Assert.assertTrue(res == Problem_20.rightAnswer());
    }
}
