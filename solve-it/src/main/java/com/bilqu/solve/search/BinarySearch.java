package com.bilqu.solve.search;

public class BinarySearch {

    //works only on a sorted list
    public static void main(String[] args) {
        int[] input_1 = new int[]{-3,0,1,5,11,17,18};
        int input_1_sch = 2;

        System.out.println(search(input_1,input_1_sch));

        int[] input_2 = new int[]{-3,0,1,5,9,17,18};
        int input_2_sch = 9;

        System.out.println(search(input_2,input_2_sch));

    }

    private static int search(int[] input, int srch){

        if(input.length == 0) return -1;

        int left = 0;
        int right = input.length - 1;

        while(left <= right){
            int median = left +(right - left)/2;

            if(input[median] == srch) {
                return median;
            }else if(input[median] > srch){
                right  = median - 1;
            }else{
                left = median + 1;
            }
        }

        return -1;
    }
}
