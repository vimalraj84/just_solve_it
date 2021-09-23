package com.bilqu.solve.prob.math;


import java.util.Arrays;

//  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//   Input: nums = [-4,-1,0,3,10]
//   Output: [0,1,9,16,100]
//   Explanation: After squaring, the array becomes [16,1,0,9,100].
//   After sorting, it becomes [0,1,9,16,100].
public class SquaresOfSortedArray {

    public static void main(String[] args) {
        Arrays.stream(sortedSquares(new int[]{-4,-1,0,3,10})).forEach(System.out::println);
    }

    public static int[] sortedSquares(int[] nums) {

        int input_size = nums.length;
        int positive_pointer = 0;


        while (positive_pointer < input_size  && nums[positive_pointer] < 0){
            positive_pointer += 1;
        }

        int negative_pointer = positive_pointer -1;

        int[] output = new int[input_size];
        int output_index = 0;

        while(positive_pointer < input_size && negative_pointer >= 0){

            if( nums[negative_pointer] * nums[negative_pointer] < nums[positive_pointer] * nums[positive_pointer]){
                output[output_index] = nums[negative_pointer] * nums[negative_pointer];
                negative_pointer -= 1;
            }else{
                output[output_index] = nums[positive_pointer] * nums[positive_pointer];
                positive_pointer += 1;
            }
            output_index += 1;
        }

        while (negative_pointer >= 0 ){
            output[output_index] = nums[negative_pointer] * nums[negative_pointer];
            negative_pointer -= 1;
            output_index += 1;
        }

        while (positive_pointer < input_size ){
            output[output_index] = nums[positive_pointer] * nums[positive_pointer];
            positive_pointer += 1;
            output_index += 1;
        }
        return output;

    }
}
