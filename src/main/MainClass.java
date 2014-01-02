package main;

import Problems.*;

// http://projecteuler.net/

public class MainClass {
    public static void calculateWorkTime(Integer count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            //Problem_12.solution_1(Problem_12.inputValue());
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime + " ms.");
    }
    public static void main(String args[]) {
        //calculateWorkTime(1);
        Problem_5.solution_1(Problem_5.inputValue());
    }
}
