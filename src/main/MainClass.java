package main;

import Problems.*;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

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
        /*try {
            PrintStream st = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(st);
            //calculateWorkTime(1);
            //Problem_22.solution_1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        //calculateWorkTime(1);
        //Problem_22.solution_1(Problem_22.inputData("problem_22.txt"));

        Problem_30.solution_1(Problem_30.inputValue());

        /*JFrame fr = new JFrame("My Frame");
        fr.setSize(new Dimension(300, 400));
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        */


    }
}
