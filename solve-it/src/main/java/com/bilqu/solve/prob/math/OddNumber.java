package com.bilqu.solve.prob.math;

import java.util.stream.IntStream;

public class OddNumber {

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
    }

    public static int countOdds(int low, int high) {
        long count = IntStream.rangeClosed(low,high).filter(i -> i%2 != 0).count();
        int counter = 0;
        for(int i = low;i<=high;i++){
            if(i%2!=0)counter++;
        }
        return counter;
    }
}
