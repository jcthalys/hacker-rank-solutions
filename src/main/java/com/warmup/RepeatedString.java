package com.warmup;

public class RepeatedString {

    /*static long repeatedString(String s, long n) {
        int count = 0;
        String repeted = "";
        while (repeted.length() < n) {
            int difference = repeted.length() + s.length();
            if (difference < n) {
                repeted += s;
            } else {
                repeted = repeted + s.substring(0, Math.abs(repeted.length() - Long.valueOf(n).intValue()));
            }

        }
        for(int i =0 ; i<repeted.length(); i++){
            if(repeted.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }*/

    private static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;

        //Determines how many a's are in a substring
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countForSubstring++;
            }
        }
        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();
        totalCount += divisor * countForSubstring;

        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("a", 1000000000000L));
    }
}
