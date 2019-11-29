package com.warmup;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SockMerchant {

    static int sockMerchant(int[] ar) {
        Map<Integer, Long> piles = Arrays.stream(ar)
                .mapToObj(o -> Integer.valueOf(o))
                .collect(Collectors.groupingBy(o -> o,
                        Collectors.counting()));
        int result = 0;
        for (Map.Entry<Integer, Long> entry: piles.entrySet()) {
            result += entry.getValue() / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}) == 3);
    }
}
