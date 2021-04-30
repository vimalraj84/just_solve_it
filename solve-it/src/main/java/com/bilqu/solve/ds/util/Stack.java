package com.bilqu.solve.ds.util;

public class Stack<T>{

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