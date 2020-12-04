package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsCandies {

    private static int[] candies = new int[] {2,3,5,1,3};
    private static int extraCandies = 3;

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int most = Arrays.stream(candies).max().getAsInt();

        for(int i : candies){
            if((i+extraCandies) >= most) {
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
