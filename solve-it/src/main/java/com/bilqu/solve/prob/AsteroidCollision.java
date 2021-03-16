package com.bilqu.solve.prob;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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


    public static class Stack<T>{

        private int top;
        private int size;
        private T[] element;

        public Stack(int size){
            this.top = 0;
            this.size = size;
            element = (T[]) new Object[size];
        }

        public void push(T e)throws Exception{
            if(isFull())
                throw new Exception("Stack is already Full");
            element[++top] = e;
        }

        public T pop() throws Exception {
            T output =  peek();
            element[--top] = null;
            return output;
        }

        public T peek() throws Exception {
            if(isEmpty()){
                throw new Exception("Stack is Empty");
            }
            return element[top-1];
        }

        public boolean isEmpty(){
            return element.length == 0?true:false;
        }

        public boolean isFull(){
            return top == size?true:false;
        }

        public <T> Object[] readAll(){
            return element;
        }

    }

}
