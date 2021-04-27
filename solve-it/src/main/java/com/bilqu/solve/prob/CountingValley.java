package com.bilqu.solve.prob;

import java.io.IOException;

public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys( String s) {

        int downCounter = 0;
        boolean groundLevel = true;
        char[] steps = s.toCharArray();
        int upCounter = 0;
        for(char c : steps) {
            // Step up
            if(c == 'U') {
                if(upCounter == -1) {
                    downCounter++;
                }
                upCounter++;
            }
            // Step down
            else {
                upCounter--;
            }
        }
        return downCounter;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys("UDDDUDUU"));
        System.out.println(countingValleys("UDUDUDUD"));
        System.out.println(countingValleys("DUUDDUDD"));
    }
}