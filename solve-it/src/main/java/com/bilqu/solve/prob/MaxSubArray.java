package com.bilqu.solve.prob;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
public class MaxSubArray {

    public static void main(String[] args) {
//        System.out.println("{8,1,3,4,1,2,1,5,4} ->"+findMaxSubArray(new int[] {8,1,3,4,1,2,1,5,4}));
        System.out.println("{-2,1,-3,4,-1,2,1,-5,4} ->"+findMaxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.println("{-2,} ->"+findMaxSubArray(new int[] {-2,4}));
//        System.out.println("{4} ->"+findMaxSubArray(new int[] {4}));
    }

    public static int findMaxSubArray(int[] input) {
        int max=input[0];
        int current=0;
        for(int i :input)
        {
            if(current<0)
                current=0;
            current+=i;
            max=Math.max(max,current);
        }
        return max;
    }
}
