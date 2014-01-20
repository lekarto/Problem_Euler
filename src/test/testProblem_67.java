package test;


import Problems.Problem_67;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_67 {
    @Test
    public void testSolution_1() {
        long res = Problem_67.solution_1();
        Assert.assertTrue(res == Problem_67.rightAnswer());
    }
}
