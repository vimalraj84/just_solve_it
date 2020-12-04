package com.bilqu.solve.prob;

import java.util.Arrays;

public class ArrayShuffle{

    public static void main (String[] a){
        int[] nums = new int[]{1,2,3,4,4,3,2,1};
        int n = 4;
        shuffle(nums,n);

    }

    private static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        for(int i = 0,j=0; i < n ; i++,j++){
            output[j] = nums[i];
            output[++j] = nums[n+i];
        }
        Arrays.stream(output).forEach(System.out::print);
        return output;
    }
}
