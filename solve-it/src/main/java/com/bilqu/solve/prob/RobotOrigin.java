package com.bilqu.solve.prob;

import java.util.Locale;

public class RobotOrigin {

    public static void main(String[] args) {

        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LDRRLRUULR"));
    }

    public static boolean judgeCircle(String moves) {

        int x_axis = 0;
        int y_axis = 0;

        for(char ch : moves.toUpperCase().toCharArray()){
            if(ch == 'U'){
                y_axis += 1;
            }else if(ch == 'D'){
                y_axis -= 1;
            }else if(ch == 'L'){
                x_axis += 1;
            }else if(ch == 'R'){
                x_axis -=1;
            }
        }

        return (x_axis == 0 && y_axis == 0);

    }
}
