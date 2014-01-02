package test;

import Problems.Problem_5;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_5 {
    @Test
    public void testSolution_1() {
        long res = Problem_5.solution_1(Problem_5.inputValue());
        Assert.assertTrue(res == Problem_5.rightAnswer());
    }

}
