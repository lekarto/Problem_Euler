package test;

import Problems.Problem_8;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_8 {
    @Test
    public void testSolution_1() {
        long res = Problem_8.solution_1(Problem_8.inputValue());
        Assert.assertTrue(res == Problem_8.rightAnswer());
    }
}
