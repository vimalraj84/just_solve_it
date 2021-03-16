package com.bilqu.solve.prob;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Stack;

public class StringDecoder {

    public static void main(String[] args) {
        String ip1 = "11[a]2[bc]";
        System.out.printf("Decoded value of %s is %s\n",ip1,decodeString(ip1));
        String ip2 = "3[a2[c]]";
        System.out.printf("Decoded value of %s is %s\n",ip2,decodeString(ip2));
        String ip3 = "2[abc]3[cd]ef";
        System.out.printf("Decoded value of %s is %s\n",ip3,decodeString(ip3));
    }

    public static String decodeString(String eStr){

        Stack<Integer> counterStack = new Stack();
        Stack<String>charStack = new Stack();

        int index = 0;
        String seqOfCharToPrint = "";

        while (index < eStr.length()){
            if(Character.isDigit(eStr.charAt(index))){
                int noOfTimes =0;
                while(Character.isDigit(eStr.charAt(index))) {
                    noOfTimes = 10 * noOfTimes +(eStr.charAt(index) - '0');
                    index++;
                }
                counterStack.push(noOfTimes);
            }else if(eStr.charAt(index) == '['){
                charStack.push(seqOfCharToPrint);
                seqOfCharToPrint = "";
                index++;
            }else if(eStr.charAt(index) == ']'){
                int noOfTimes = counterStack.pop();
                StringBuilder temp = new StringBuilder(charStack.pop());
                for(int i =0; i< noOfTimes ; i++){
                    temp.append(seqOfCharToPrint);
                }
                seqOfCharToPrint = temp.toString();
                index++;
            }else{
                seqOfCharToPrint += eStr.charAt(index);
                index++;
            }
        }
        return seqOfCharToPrint;
    }
}
