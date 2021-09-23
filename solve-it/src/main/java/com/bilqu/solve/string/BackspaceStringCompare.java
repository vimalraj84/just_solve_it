package com.bilqu.solve.string;


public class BackspaceStringCompare {

    public static void main(String[] args) {

        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##","c#d#"));
        System.out.println(backspaceCompare("a##c","#a#c"));
        System.out.println(backspaceCompare("a#c","b"));

    }

    private static boolean backspaceCompare(String s,String t)  {

        if(s ==null||t == null)
            return false;

        if(s.length() == 0 || t.length() == 0)
            return false;

        if(s.equalsIgnoreCase(t))
            return true;

        StringBuilder s_stack = new StringBuilder();
        StringBuilder t_stack = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++ ){
            char tmp = s.charAt(i);
            if(tmp == '#') {
                if(i > 0 && s_stack.length() > 0)
                    s_stack.deleteCharAt(s_stack.length() -1 );
            }else {
                s_stack.append(tmp);
            }

        }

        for(int i = 0 ; i < t.length() ; i++ ){
            char tmp = t.charAt(i);
            if(tmp == '#') {
                if(i > 0  && t_stack.length() > 0 )
                    t_stack.deleteCharAt(t_stack.length() -1 );
            }else {
                t_stack.append(tmp);
            }
        }

        System.out.println(s_stack.toString()+"="+t_stack.toString());
        if(s_stack.toString().equalsIgnoreCase(t_stack.toString()))
            return true;
        else
            return false;

    }
}
