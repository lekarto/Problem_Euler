package main;

import Problems.*;

/**
 * Created with IntelliJ IDEA.
 * User: Lekarto
 * Date: 18.12.13
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */

// http://projecteuler.net/

public class MainClass {
    public static void calculateWorkTime(Integer count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Problem_10.solution_1();
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime + " ms.");
    }
    public static void main(String args[]) {
        calculateWorkTime(1);


    }
}
