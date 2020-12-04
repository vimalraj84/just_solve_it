package com.bilqu.solve.prob;


import java.util.Arrays;

public class ReverseCharArray {


    private static char[] input1= new char[] {'B','I','L','Q','U'};
    private static char[] input2= new char[] {'T','E','S','T'};

    public static void main(String[] a){
        reverse(input1);
        System.out.println(input1);
        reverse(input2);
        System.out.println(input2);
    }

    private static void reverse(char[] input){
        char temp ;
        for(int i =0 ; i<input.length/2 ; i++){
            temp=input[(input.length-1)-i];
            input[(input.length-1)-i] = input[i];
            input[i]=temp;
        }
    }

}
