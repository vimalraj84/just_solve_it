package com.bilqu.solve.math;

public class RomanNumbers {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    For example,
//    2 is written as II in Roman numeral, just two one's added together.
//    12 is written as XII, which is simply X + II.
//    The number 27 is written as XXVII, which is XX + V + II.

//    Roman numerals are usually written largest to smallest from left to right.
//    However, the numeral for four is not IIII. Instead, the number four is written as IV.
//    Because the one is before the five we subtract it making four.
//    The same principle applies to the number nine, which is written as IX.

//    There are six instances where subtraction is used:
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
    public static void main(String[] args) {


        System.out.println(intToRoman(1));
        System.out.println(intToRoman(2));
        System.out.println(intToRoman(6));
        System.out.println(intToRoman(7));
        System.out.println(intToRoman(90));
        System.out.println(intToRoman(400));
        System.out.println(intToRoman(900));
        System.out.println(intToRoman(1994));

//        IntStream.range(1,21).forEach(i -> System.out.println(i+" = "+intToRoman(i)));

    }


    public static String intToRoman(int num) {

        StringBuilder romanNumber = new StringBuilder();

        int thousand = num/1000;
        int hundreds = (num%1000)/100;
        int tens = ((num%1000)%100)/10;
        int ones = (((num%1000)%100)%10)%10;

        while(thousand > 0){
            romanNumber.append("M");
            thousand--;
        }

        // C can be placed before D (500) and M (1000) to make 400 and 900.
        int temp_hundreds = hundreds;
        while(temp_hundreds > 0){
            if(temp_hundreds == hundreds){
                if(temp_hundreds == 4){
                    romanNumber.append("CD");
                    break;
                }else if(temp_hundreds == 9){
                    romanNumber.append("CM");
                    break;
                }else if(temp_hundreds == 5){
                    romanNumber.append("D");
                    break;
                }
            }
            if(temp_hundreds < 4){
                romanNumber.append("C");
                temp_hundreds--;
            }else if(temp_hundreds > 5){
                romanNumber.append("D");
                temp_hundreds=temp_hundreds-5;
            }

        }

        // X can be placed before L (50) and C (100) to make 40 and 90.
        int temp_tens = tens;
        while(temp_tens > 0){
            if(tens == temp_tens){
                if(temp_tens == 4){
                    romanNumber.append("XL");
                    break;
                }else if(temp_tens == 9){
                    romanNumber.append("XC");
                    break;
                }else if(temp_tens == 5 ){
                    romanNumber.append("L");
                    break;
                }
            }
            if(temp_tens < 4){
                romanNumber.append("X");
                temp_tens--;
            }else if(temp_tens > 5  ){
                romanNumber.append("L");
                temp_tens=temp_tens-5;
            }
        }

        // I can be placed before V (5) and X (10) to make 4 and 9.
        int temp_ones = ones;
        while(temp_ones > 0){
            if(temp_ones == temp_ones){
                if(temp_ones == 4){
                    romanNumber.append("IV");
                    break;
                }else if(temp_ones == 9){
                    romanNumber.append("IX");
                    break;
                }else if(temp_ones == 5 ){
                    romanNumber.append("V");
                    break;
                }
            }
            if(temp_ones < 4){
                romanNumber.append("I");
                temp_ones--;
            }else if(temp_ones >  5){
                romanNumber.append("V");
                temp_ones=temp_ones-5;
            }
        }
        return romanNumber.toString();

    }
}
