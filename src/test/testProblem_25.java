package test;

import Problems.Problem_25;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_25 {
    @Test
    public void testSolution_1() {
        long res = Problem_25.solution_1(Problem_25.inputValue());
        Assert.assertTrue(res == Problem_25.rightAnswer());
    }

    @Test
    public void testSolution_1_length3() {
        long res = Problem_25.solution_1(3);
        Assert.assertTrue(res == 12);
    }
}
