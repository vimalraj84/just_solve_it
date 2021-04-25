package com.bilqu.solve.prob;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] ip = new int[] {2,7,11,15};
        int[] op = twoSum(ip,9);

        Arrays.stream( op).forEach(System.out::println);

    }

    public static int[] twoSum (int[] numbers, int target){
        int start_pointer = 0;
        int end_pointer = numbers.length -1;

        while (start_pointer <= end_pointer){
            int sum = numbers[start_pointer]+numbers[end_pointer];

            if(sum > target){
                --end_pointer;
            }else if(sum < target){
                ++start_pointer;
            }else{
                return new int[]{start_pointer+1,end_pointer+1};
            }
        }
        return  new int[]{start_pointer+1,end_pointer+1};
    }
}
