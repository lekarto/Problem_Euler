package test;

import Problems.Problem_22;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_22 {
    @Test
    public void testSolution_1() {
        long res = Problem_22.solution_1(Problem_22.inputData("problem_22.txt"));
        Assert.assertTrue(res == Problem_22.rightAnswer());
    }
}
