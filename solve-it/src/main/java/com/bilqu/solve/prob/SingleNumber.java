package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    private static int[] input1  = new int[]{2,2,1};
    private static int[] input2  = new int[]{4,1,2,1,2};


    private static int findSingleNum(int[] input){
        List<Integer> singleList = new ArrayList<>();
        for(int i : input){
            if(!singleList.isEmpty() && singleList.contains(i)){
                singleList.remove(Integer.valueOf(i));
            }else{
                singleList.add(i);
            }
        }
        return singleList.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findSingleNum(input1));
        System.out.println(findSingleNum(input2));

    }
}
