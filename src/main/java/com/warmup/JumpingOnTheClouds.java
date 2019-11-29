package com.warmup;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numJumps = 0;
        int i = 0;

        while (i < c.length-1) {
            if (i+2 == c.length || c[i+2] == 1) {
                i++;
                numJumps++;
            } else {
                i += 2;
                numJumps++;
            }
        }
        return numJumps;
    }

    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};

        int[] clouds2 = {0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(clouds));
        System.out.println(jumpingOnClouds(clouds2));
    }
}
