package com.arrays;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxTemp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i > 0 && i < arr.length - 1 && j > 0 && j < arr[i].length - 1) {
                    int a = arr[i - 1][j - 1];
                    int b = arr[i - 1][j];
                    int c = arr[i - 1][j + 1];
                    int d = arr[i][j];
                    int e = arr[i + 1][j - 1];
                    int f = arr[i + 1][j];
                    int g = arr[i + 1][j + 1];
                    int sum = a + b + c + d + e + f + g;
                    if (sum > maxTemp) {
                        maxTemp = sum;
                    }
                }
            }
        }
        return maxTemp;
    }

    public static void main(String[] args) {
        //j
        /*int[][] ints = {{1, 1, 1, 0, 0, 0}, // i
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}}; ==> 19*/

        /*int[][] ints = {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 9, 2, -4, -4, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, -1, -2, -4, 0}}; // ==> 13*/

        int[][] ints =  {{0, -4, -6, 0, -7, -6},
                        {-1, -2, -6, -8, -3, -1},
                        {-8, -4, -2, -8, -8, -6},
                        {-3, -1, -2, -5, -7, -4},
                        {-3, -5, -3, -6, -6, -6},
                        {-3, -6, 0, -8, -6, -7}};
        System.out.println(hourglassSum(ints));
    }
}
