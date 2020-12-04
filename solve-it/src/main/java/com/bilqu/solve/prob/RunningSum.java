package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RunningSum {

    public static void main(String[] args) {
        Arrays.stream(runningSum(new int[]{1,2,3,4})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(runningSum(new int[]{1,1,1,1,1})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(runningSum(new int[]{3,1,2,10,1})).forEach(System.out::print);

    }
    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            if(i == 0){
                output[i] =nums[0];
            }else {
                output[i] = output[i - 1] + nums[i];
            }

        }
        return output;
    }
}
