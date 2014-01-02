package Problems;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

// Right answer: 5537376230

public class Problem_13 {
    public static long solution_1(ArrayList<BigInteger> ar) {

        //ArrayList<BigInteger> ar = new ArrayList<BigInteger>();

        /*try {
            ar = readBigIntegerFromFile("problem_12.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        BigInteger sum = BigInteger.valueOf(0);
        String ans;
        for (BigInteger val : ar) {
            sum = sum.add(val);
        }
        if (String.valueOf(sum).length() < 10) {
            ans = String.valueOf(sum);
        } else {
            ans = String.valueOf(sum).substring(0,10);
        }
        System.out.println(String.valueOf(ans));
        return Long.valueOf(String.valueOf(ans));
    }

    private static ArrayList<BigInteger> readBigIntegerFromFile(String fileName) throws FileNotFoundException {
        ArrayList<BigInteger> ar = new ArrayList<BigInteger>();
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    ar.add(ar.size(), new  BigInteger(s));
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ar;
    }

    public static long rightAnswer() {
        return 5537376230L;
    }

    public static ArrayList<BigInteger> inputValue(String fileName) {
        ArrayList<BigInteger> ar = new ArrayList<BigInteger>();
        try {
            ar = readBigIntegerFromFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ar;
    }
}