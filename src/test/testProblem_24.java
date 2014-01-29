package test;

import Problems.Problem_24;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class testProblem_24 {
    @Test
    public void testSolution_1() {
        int[][] inputValues = Problem_24.inputValue();
        ArrayList<Integer> dataValues = new ArrayList<Integer>();
        for (int i = 0; i < inputValues[0].length; i++) {
            dataValues.add(inputValues[0][i]);
        }
        long res = Problem_24.solution_1(dataValues, inputValues[1][0]);
        Assert.assertTrue(res == Problem_24.rightAnswer());
    }
    @Test
    public void testSolution_1_with012() {
        ArrayList<Integer> dataValues = new ArrayList<Integer>();
        for (int i = 0; i <= 2; i++) {
            dataValues.add(i);
        }
        long res = Problem_24.solution_1(dataValues, 5);
        Assert.assertTrue(res == 201L);

        res = Problem_24.solution_1(dataValues, 100);
        Assert.assertTrue(res == -1L);
    }
}
