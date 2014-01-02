package test;

import Problems.Problem_9;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_9 {
    @Test
    public void testSolution_1() {
        long res = Problem_9.solution_1();
        Assert.assertTrue(res == Problem_9.rightAnswer());
    }
}
