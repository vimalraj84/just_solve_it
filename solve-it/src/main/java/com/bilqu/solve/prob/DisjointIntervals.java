package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisjointIntervals {

    private static final int[] input1 = new int[]{5,0,3,8,6};
    private static final int[] input2 = new int[]{1,1,1,0,6,12};
    private static final int[] input3 = new int[]{1,1};
    private static final int[] input4 = new int[]{26,51,40,58,42,76,30,48,79,91};

    public static void main(String[] args) {
        System.out.println(partitionDisjoint(input1));
        System.out.println(partitionDisjoint(input2));
        System.out.println(partitionDisjoint(input3));
        System.out.println(partitionDisjoint(input4));
    }

    public static int partitionDisjoint(int[] input) {
        int[] left = new int[input.length];
        int[] right = new int[input.length];

        int last = input[0];
        for(int i=0; i<input.length;i++){
           last = Math.max(last,input[i]);
           left[i]=last;
        }

        last = input[input.length-1];
        for(int i=input.length-1; i>=0;i--){
            last=Math.min(last,input[i]);
            right[i]=last;
        }
        System.out.println("----------\n");
        Arrays.stream(input).forEach(System.out::print);
        System.out.println("\n----------");
        Arrays.stream(left).forEach(System.out::print);
        System.out.println();
        Arrays.stream(right).forEach(System.out::print);
        System.out.println("\n----------");


        for(int i= 1; i<input.length;i++){
            if(left[i-1]<=right[i])
                return i;
        }
        return 0;
    }
}
