package test;

import Problems.Problem_26;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_26 {
    @Test
    public void testSolution_1() {
        long res = Problem_26.solution_1(Problem_26.inputValue());
        Assert.assertTrue(res == Problem_26.rightAnswer());
    }
}
