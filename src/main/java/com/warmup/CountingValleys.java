package com.warmup;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int altitude = 0;
        int valleys = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (altitude == -1) {
                    valleys++;
                }
                altitude++;
            }

            if (s.charAt(i) == 'D') {
                altitude--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DDUUDDUDUUUD") == 2);
        System.out.println(countingValleys(10, "UDUUUDUDDD") == 0);

        /*
            /\/\
           /    \
        /\/      \
         */

        /**
         *             /\
         *         \  /  \    /
         *          \/    \/\/
         */
    }
}
