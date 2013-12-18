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
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        //Problem_1.solution_1();
        //Problem_2.solution_1();
        //for (int i = 0; i < 1000; i++) {
            //Problem_3.solution_3();
            Problem_5.solution_1();
        //}
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime + " ms.");

    }
}
