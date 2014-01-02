package test;

import Problems.Problem_7;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_7 {
    @Test
    public void testSolution_1() {
        long res = Problem_7.solution_1(Problem_7.inputValue());
        Assert.assertTrue(res == Problem_7.rightAnswer());
    }

    @Test
    public void testSolution_2() {
        long res = Problem_7.solution_2(Problem_7.inputValue());
            Assert.assertTrue(res == Problem_7.rightAnswer());
    }
}
