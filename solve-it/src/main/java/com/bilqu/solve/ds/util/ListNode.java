package com.bilqu.solve.ds.util;


//Singly linked list
public class ListNode<T> {
    private T value;
    private ListNode<T> next;
    public ListNode(T value){
        this.value = value;
    }

    public ListNode(T value, ListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value +" -> "+ next ;
    }
}
