package Problems;

public class Problem_33 {
    public static void solution_1() {
        System.out.println((49./98) == (4./8));
        int num = 1;
        int denum = 1;

        for (int denumerator = 11; denumerator <= 99; denumerator++) {
            for (int numerator = 10; numerator < denumerator; numerator++) {
                int i = 0;
                while (i <= 1) {
                    StringBuilder d1 = new StringBuilder(Integer.toString(numerator));
                    StringBuilder d2 = new StringBuilder(Integer.toString(denumerator));
                    int pos = d2.indexOf(String.valueOf(d1.charAt(i)));
                    if (( pos > -1 ) && (d1.charAt(i) != '0')) {
                        d1.delete(i, i+1);
                        d2.delete(pos, pos+1);
                        if ((Integer.valueOf(d2.toString()) != 0) &&
                            (numerator*1./denumerator == Integer.valueOf(d1.toString())*1./
                                                      Integer.valueOf(d2.toString()))) {
                            denum *= Integer.valueOf(d2.toString());
                            num *= Integer.valueOf(d1.toString());
                            System.out.println(numerator+"/"+denumerator + " = " + d1+"/"+d2 );
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        System.out.println(denum/functions.gcd(denum, num));
    }
}
