package com.bilqu.solve.prob;


import com.bilqu.solve.ds.util.Stack;

import java.util.Arrays;
import java.util.Objects;

public class AsteroidCollision {

    public static void main(String[] args) throws Exception {
        Arrays.stream(findAsteroidCollision2(new int[]{5,10,-5})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(findAsteroidCollision(new int[]{5,10,-5})).forEach(System.out::print);
        System.out.println();

        Arrays.stream(findAsteroidCollision2(new int[]{8, -8})).filter(Objects::nonNull).forEach(System.out::print);
        System.out.println();

        Arrays.stream(findAsteroidCollision2(new int[]{10, 2, -5})).forEach(System.out::print);
        System.out.println();

        Arrays.stream(findAsteroidCollision2(new int[]{-2, -1, 1, 2})).forEach(System.out::print);
        System.out.println();

//        Arrays.stream(findAsteroidCollision(new int[]{10, 2, -5})).forEach(System.out::print);
//        System.out.println();
//
//        Arrays.stream(findAsteroidCollision(new int[]{-2, -1, 1, 2)).forEach(System.out::print);



    }

    private static int[] findAsteroidCollision(int[] asteroid) throws Exception {

        Stack<Integer> stack = new Stack(asteroid.length);

        for(int i =0 ; i<asteroid.length;i++){
            if(!stack.isEmpty() && asteroid[i] < 0){
                if(stack.peek() < asteroid[i]){
                    stack.pop();
                }
            }else{
                stack.push(asteroid[i]);
            }
        }
        return  Arrays.stream(stack.readAll()).filter(Objects::nonNull).mapToInt(i -> (Integer)i).toArray();
    }


    private static int[] findAsteroidCollision2(int[] asteroid) throws Exception {

        java.util.Stack<Integer> stack = new  java.util.Stack();
        int peek = 0;
        for(int i =0 ; i<asteroid.length;i++){
            if(!stack.isEmpty()){
                peek = stack.peek();
               if(asteroid[i] < 0){
                   while(true) {
                       if(peek > 0 ) {
                           if ((peek + asteroid[i]) == 0) {
                               stack.pop();
                               break;
                           } else {
                               if (peek > -asteroid[i]) {
                                   break;
                               }
                               if (peek < -asteroid[i]) {
                                   stack.pop();
                                   if (stack.isEmpty()) {
                                       stack.push(asteroid[i]);
                                       break;
                                   } else {
                                       peek = stack.peek();
                                       continue;
                                   }
                               }
                           }
                       }else{
                           stack.push(asteroid[i]);
                           break;
                       }
                   }
                }else{
                    stack.push(asteroid[i]);
                }
            }else{
                stack.push(asteroid[i]);
            }
        }
        return  Arrays.stream(stack.toArray()).filter(Objects::nonNull).mapToInt(i -> (Integer)i).toArray();
    }




}
