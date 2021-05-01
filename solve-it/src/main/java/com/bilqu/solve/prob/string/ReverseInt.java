package com.bilqu.solve.prob.string;

public class ReverseInt {

    public static void main(String[] args) {

        System.out.println("123 : "+reverse(123));
        System.out.println("-123 : "+reverse(-123));
        System.out.println("120 : "+reverse(120));
        System.out.println("-120 : "+reverse(-120));

        System.out.println("MAX="+Integer.MAX_VALUE);
        System.out.println("MIN="+Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE/10+" : "+reverse(Integer.MAX_VALUE/10));
        System.out.println(Integer.MIN_VALUE/10+" : "+reverse(Integer.MIN_VALUE/10));
    }

    private static int reverse(int input){
        int reversed = 0;

        if(input == 0)
            return reversed;

        while (input != 0){
            int pop = input %10;
            input /= 10;

            //This statement can cause overflow of Integer range

            if(reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && pop > 7))//overflow only if pop > 7 since, Int Range 2147483647
                return 0;
            if(reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && pop < -8))//overflow only if pop < -8 since,Int Range -2147483648
                return 0;

            reversed = (reversed *10) + pop;
        }

        return reversed;
    }
}
