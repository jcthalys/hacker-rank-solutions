package com.arrays;

import java.util.Arrays;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            int tempNum = a[0];
            System.arraycopy(a, 1, a, 0, a.length - 1);
            a[a.length - 1] = tempNum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 1)));
    }
}
