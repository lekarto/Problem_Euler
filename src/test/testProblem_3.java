package test;

import Problems.Problem_3;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_3 {
    @Test
    public void testSolution_1() {
        long res = Problem_3.solution_1(Problem_3.inputValue());
        Assert.assertTrue(res == Problem_3.rightAnswer());
    }
}
