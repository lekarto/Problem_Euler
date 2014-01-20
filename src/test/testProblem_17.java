package test;

import Problems.Problem_17;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_17 {
    @Test
    public void testSolution_1() {
        int range[] = Problem_17.inputValue();
        long res = Problem_17.solution_1(range[0], range[1]);
        Assert.assertTrue(res == Problem_17.rightAnswer());
    }

    @Test
    public void testSolution_1_for_10_19() {
        long res = Problem_17.solution_1(10, 19);
        Assert.assertTrue(res == 70);
    }
}
