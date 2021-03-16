package com.bilqu.solve.prob;

import java.util.Arrays;

public class ArrayIndexFinder {

    public static void main(String[] args) {
        int[] result = new int[2];

        int[] ip1 = new int[]{5,7,7,8,8,10}; int ipTgt1 = 8;

        int[] ip2 = new int[]{5,7,7,8,8,10}; int ipTgt2 = 11;

        result[0] = findFirstIndex(ip1,ipTgt1);
        result[1] = findLastIndex(ip1,ipTgt1);

        Arrays.stream(result).forEach(System.out::print);
        System.out.println();

        result[0] = findFirstIndex(ip2,ipTgt2);
        result[1] = findLastIndex(ip2,ipTgt2);

        Arrays.stream(result).forEach(System.out::print);

    }

    private static int findFirstIndex(int[] ip, int ipTgt){
        int start = 0;
        int end = ip.length -1 ;
        int index = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(ip[mid] >= ipTgt){
                end = mid - 1;
            }else{
                start = mid  + 1;
            }
            if(ip[mid] == ipTgt) index = mid;
        }
        return index;


    }

    private static int findLastIndex(int[] ip, int ipTgt){
        int start = 0;
        int end = ip.length -1 ;
        int index = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(ip[mid] <= ipTgt){
                start = mid +1;
            }else{
                end = mid  - 1;
            }
            if(ip[mid] == ipTgt) index = mid;
        }
        return index;
    }
}
