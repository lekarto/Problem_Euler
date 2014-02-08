package test;


import Problems.Problem_58;
import junit.framework.Assert;
import org.junit.Test;

public class testProblem_58 {
    @Test
    public void testSolution_1() {
        Assert.assertTrue(Problem_58.solution_1(Problem_58.inputValue()) == Problem_58.rightAnswer());
    }
}
