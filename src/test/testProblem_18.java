package test;


import Problems.Problem_18;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_18 {
    @Test
    public void testSolution_1() {
        long res = Problem_18.solution_1();
        Assert.assertTrue(res == Problem_18.rightAnswer());
    }
}
