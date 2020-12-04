package com.bilqu.solve.prob;

import java.util.Arrays;

public class ImageFlipper {
    public static void main(String[] args) {

        int[][] image1 = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2 = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        Arrays.stream(flipAndInvertImage(image1)).forEach(i -> Arrays.stream(i).forEach(System.out::print));
        System.out.println();
        Arrays.stream(flipAndInvertImage(image2)).forEach(i -> Arrays.stream(i).forEach(System.out::print));

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] output = new int[A.length][A.length];

        for(int j=0;j<A.length;j++){
            int[] flipped = new int[A[j].length];
            int k = 0;
            for(int i = A[j].length-1; i>=0; i--){
                if(A[j][i] == 0)  flipped[k]=1;
                else flipped[k]=0;
                ++k;
            }
            output[j] = flipped;
        }
        return output;
    }

}
