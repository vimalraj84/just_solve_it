package com.bilqu.solve.prob;

public class StringArrayEquivalent {

    public static String[] word1 = new String[]{"ab", "c"};
    public static String[] word2 = new String[]{"ab", "bc"};

    public static void main(String[] args) {

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;

        StringBuilder word1Sb = new StringBuilder();
        StringBuilder word2Sb = new StringBuilder();

        for(String s : word1){
            word1Sb.append(s);
        }

        for(String s : word2){
            word2Sb.append(s);
        }

        if(word1Sb.toString().equalsIgnoreCase(word2Sb.toString())){
            result =  true;
        }


        return result;
    }
}
