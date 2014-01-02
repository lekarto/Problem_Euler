package test;

import Problems.Problem_4;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_4 {
    @Test
    public void testSolution_1() {
        long res = Problem_4.solution_1(Problem_4.inputValue());
        Assert.assertTrue(res == Problem_4.rightAnswer());
    }
}
