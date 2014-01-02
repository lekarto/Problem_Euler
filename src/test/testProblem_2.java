package test;

import Problems.Problem_2;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_2 {
    @Test
    public void testSolution_1() {
        long res = Problem_2.solution_1(Problem_2.inputValue());
        Assert.assertTrue(res == Problem_2.rightAnswer());
    }
}
