package Problems;

import java.util.ArrayList;

public class Problem_40 {
    public static long solution_1(ArrayList<Integer> digitNums) {
        long mul = 1;
        int length = 0;
        int i = 0;
        while (digitNums.size() > 0) {
            i++;
            String s = String.valueOf(i);
            if ((length + s.length()) >= digitNums.get(0)) {
                mul *= s.charAt(digitNums.get(0) - length - 1) - 0x30;
                digitNums.remove(0);
            }
            length += s.length();
        }

        System.out.println(mul);
        return mul;
    }

    public static long rightAnswer() {
        return 210;
    }

    public static ArrayList<Integer> inputValue() {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(10);
        lst.add(100);
        lst.add(1000);
        lst.add(10000);
        lst.add(100000);
        lst.add(1000000);
        return lst;
    }
}
