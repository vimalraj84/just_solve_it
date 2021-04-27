package com.bilqu.solve.prob.string;

import java.io.IOException;
import java.util.Scanner;

public class PalindromeBuilder {
    /*
     * buildPalindrome function below.
     */
    static String buildPalindrome(String a, String b) {
        char[] s1= a.toCharArray();
        for(int i =0;i< s1.length;i++){

            System.out.println(s1[i]);

        }


        return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        buildPalindrome("bac","bac");
        buildPalindrome("abc","def");
        buildPalindrome("jdfh","fds");
    }
}
