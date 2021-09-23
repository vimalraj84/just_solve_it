package com.bilqu.solve.string;

import java.util.function.Supplier;

public class MaxNoBalloon {

    public static void main(String[] args) {

        Supplier<MaxNoBalloon> supplier = MaxNoBalloon::new;

        MaxNoBalloon maxNoBalloon = supplier.get();
        System.out.println(maxNoBalloon.maxNumberOfBalloons("nlaebolko")); // output : 1
        System.out.println(maxNoBalloon.maxNumberOfBalloons("loonbalxballpoon")); // output : 2


    }

    //Given a string "text", you want to use the characters for "text" to form as many instances of the words "balloon" as possible.
    //You can use each character in text at most once.  Return the maximum number of instances that can be formed.
    public int maxNumberOfBalloons(String text){

        if(text == null || text.isEmpty())
            return 0;

        if(!text.contains("b")) return 0;

        int bCounter = 0;
        int aCounter = 0;
        int lCounter = 0;
        int oCounter = 0;
        int nCounter = 0;

//        IntStream intStream = text.chars();
//        intStream.sorted().mapToObj(c -> Character.toChars(c));

        for(int i =0; i< text.length(); i++){
            if(text.charAt(i) == 'b'){
                bCounter++;
            }else if(text.charAt(i) == 'a'){
                aCounter++;
            }else if(text.charAt(i) == 'l'){
                lCounter++;
            }else if(text.charAt(i) == 'o'){
                oCounter++;
            }else if(text.charAt(i) == 'n'){
                nCounter++;
            }
        }

        // Find the potential of each character.
        // Except for 'l' and 'o' the potential is equal to the frequency.
        lCounter = lCounter / 2;
        oCounter = oCounter / 2;

        return Math.min(bCounter,Math.min(aCounter,Math.min(lCounter,Math.min(oCounter,nCounter))));
    }
}
