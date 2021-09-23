package com.bilqu.solve.string;

//Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
//You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
public class LongPressedName {

    public static void main(String[] args) {

        LongPressedName  longPressedName = new LongPressedName();

        System.out.println(longPressedName.isLongPressedName("a","b"));

//        Input: name = "alex", typed = "aaleex"
//        Output: true
//        Explanation: 'a' and 'e' in 'alex' were long pressed.
        System.out.println(longPressedName.isLongPressedName("alex","aaleex"));

//        Example 2:
//        Input: name = "saeed", typed = "ssaaedd"
//        Output: false
//        Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
       System.out.println(longPressedName.isLongPressedName("saeed","ssaaedd"));

//        Example 3:
//        Input: name = "leelee", typed = "lleeelee"
//        Output: true
        System.out.println(longPressedName.isLongPressedName("leelee","lleeelee"));

//        Example 4:
//        Input: name = "laiden", typed = "laiden"
//        Output: true
//        Explanation: It's not necessary to long press any character.
        System.out.println(longPressedName.isLongPressedName("laiden","laiden"));


    }

    public boolean isLongPressedName(String name, String typed) {

        if(name.length() == typed.length() &&  name.equalsIgnoreCase(typed)) return true;
        if(name.length() > typed.length()) return false;
        int i = 0;
        int j = 0;

        while(j < typed.length()){

            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
            }else if(j == 0 || typed.charAt(j) != typed.charAt( j- 1)){ //This is a negative condition which checks whether the previous char is not the same as current
                return false;
            }
            j++;
        }
        if(i != name.length()) return false;

        return true;
    }
}
