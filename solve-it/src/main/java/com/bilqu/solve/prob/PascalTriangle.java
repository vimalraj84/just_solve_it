package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.List;

//        Pascal's triangle, each number is the sum of the two numbers directly above it as shown
//        No Of Rows : 5
//        [
//                [1],
//               [1,1],
//              [1,2,1],
//             [1,3,3,1],
//            [1,4,6,4,1]
//        ]
public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println(generateTriangle(5));
        System.out.println(generateTriangle(1));


    }

    private static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if(numRows <=0 )
            return pascalTriangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for(int i = 1; i< numRows; i++){
            List<Integer> prevRow = new ArrayList<>();
            List<Integer> currRow = new ArrayList<>();
            prevRow = pascalTriangle.get(i-1);

            //first record in the row
            currRow.add(1);

            //Compute sum
            for(int j =1; j<i ;j ++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));

            }
            //last record in the row
            currRow.add(1);
            pascalTriangle.add(currRow);
        }
        return pascalTriangle;
    }
}
