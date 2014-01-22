package test;

import Problems.Problem_23;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_23 {
    @Test
    public void testSolution_1() {
        Assert.assertTrue(Problem_23.solution_1() == Problem_23.rightAnswer());
    }
}
