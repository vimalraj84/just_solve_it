package com.bilqu.solve.prob.string;

public class ToLowerCase {

    public static void main(String[] args) {

        System.out.println("Hello : "+getLowerCase("Hello"));
        System.out.println("WHAT : "+getLowerCase("WHAT"));
        System.out.println("There Is A PRoBlem : "+getLowerCase("There Is A PRoBlem "));
    }

    private static String getLowerCase(String input){
        String output = "";

        for(char ch : input.toCharArray()){
            if(Character.isUpperCase(ch)){
                output = output + (char) (ch+32);
            }else{
                output = output + ch;
            }
        }
        return output;
    }
}
