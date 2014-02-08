package test;

import Problems.Problem_40;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class testProblem_40 {
    @Test
    public void testSolution_1() {
        Assert.assertTrue(Problem_40.solution_1(Problem_40.inputValue()) == Problem_40.rightAnswer());
    }

    @Test
    public void testSolution_1_1_10_digits() {
        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(1);
        in.add(10);
        Assert.assertTrue(Problem_40.solution_1(in) == 1);
    }
}
