package com.bilqu.solve.prob.string;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("121 : "+isPalindrome(121));
        System.out.println("-121 : "+isPalindrome(-121));
        System.out.println("4050 : "+isPalindrome(4050));
        System.out.println("13 : "+isPalindrome(13));
        System.out.println("7 : "+isPalindrome(7));
        System.out.println("-7 : "+isPalindrome(-7));
    }

    private static boolean isPalindrome(int input){
        int reversed = 0;
        if(input == 0)
            return true;

        if(input < 0 || input % 10 == 0)
            return false;

        while(input > reversed ){
            int pop = input%10; //get the last digit
            input /=  10 ;
            reversed = (reversed * 10) + pop;
        }

        if(input == reversed || input == reversed/10)
            return true;
        else
            return false;

    }
}
