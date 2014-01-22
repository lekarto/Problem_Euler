package test;

import Problems.Problem_19;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_19 {
    @Test
    public void testSolution_1() {
        long res = Problem_19.solution_1(Problem_19.inputValue());
        Assert.assertTrue(res == Problem_19.rightAnswer());
    }

    @Test
    public void testSolution_1_for_year1901() {
        long res = Problem_19.solution_1(1901);
        Assert.assertTrue(res == 2);
    }

}
