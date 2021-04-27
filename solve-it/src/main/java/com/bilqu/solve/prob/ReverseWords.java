package com.bilqu.solve.prob;

//Given an input string s, reverse the order of the words.

//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

//Return a string of the words in reverse order concatenated by a single space.

//Note that s may contain leading or trailing spaces or multiple spaces between two words.
//The returned string should only have a single space separating the words. Do not include any extra spaces.

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println("the sky is blue -> "+ doReverseWords("the sky is blue"));
        System.out.println("  hello world  -> " +doReverseWords("  hello world  "));
        System.out.println("a good   example ->" +doReverseWords("a good   example"));
        System.out.println("  Bob    Loves  Alice   ->" +doReverseWords("  Bob    Loves  Alice   "));
        System.out.println("Alice does not even like bob ->" +doReverseWords("Alice does not even like bob"));
    }

    public static String doReverseWords(String input) {
        if(input == null || input.isEmpty())
            return null;
        StringBuilder output = new StringBuilder();

        String[] temp = input.split("\\s+");
        int lastIndex = temp.length-1;
        for(int i = lastIndex; i >= 0; i--){
            if(temp[i] != null && !temp[i].isEmpty()){
                output.append(temp[i]);
                if(i != 0)
                    output.append(" ");
            }
        }
        return output.toString();
    }
}
