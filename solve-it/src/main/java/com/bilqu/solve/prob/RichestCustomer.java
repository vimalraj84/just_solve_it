package com.bilqu.solve.prob;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts1 = new int[][]{{1,2,3},{3,2,1}};
        int[][] accounts2 = new int[][]{{1,5},{7,3},{3,5}};
        int[][] accounts3 = new int[][]{{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(accounts1));
        System.out.println(maximumWealth(accounts2));
        System.out.println(maximumWealth(accounts3));
    }

    public static int maximumWealth(int[][] accounts) {
        int results=0;
        int sum =0;
        for(int[] amount: accounts){
            sum = Arrays.stream(amount).sum();
            if(sum > results){
                results = sum;
            }
        }

        return results;
    }
}
