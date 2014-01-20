package Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem_22 {

    private static String[] readNamesFromFile(String fileName) {
        String names[] = null;
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    //val = s.split("\\s+");
                    names = s.split(",");
                    for (int i = 0; i < names.length; i++) {
                        names[i] = names[i].replaceAll("\"", "");
                    }
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public static long solution_1(ArrayList<String> listNames) {
        Collections.sort(listNames);
        String letters = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long fullSum = 0;
        long sumOfName;
        for (int j = 0; j < listNames.size(); j++) {
            sumOfName = 0;
            for (int i= 0; i < listNames.get(j).length(); i++) {
                sumOfName += letters.indexOf(listNames.get(j).toUpperCase().charAt(i));
            }
            fullSum += sumOfName*(j+1);
        }
        System.out.println(fullSum);
        return fullSum;
    }

    public static long rightAnswer() {
        return 871198282;
    }

    public static ArrayList<String> inputData(String fileName) {
        ArrayList<String> listNames = new ArrayList<String>();
        listNames.addAll(Arrays.asList(readNamesFromFile(fileName)));
        return listNames;
    }
}
