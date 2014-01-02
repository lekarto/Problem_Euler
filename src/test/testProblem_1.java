package test;

import Problems.Problem_1;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_1 {
    @Test
    public void testSolution_1() {
        long res = Problem_1.solution_1(Problem_1.inputValue());
        Assert.assertTrue(res == Problem_1.rightAnswer());
    }
}
