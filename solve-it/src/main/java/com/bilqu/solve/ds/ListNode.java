<<<<<<< HEAD:solve-it/src/main/java/com/bilqu/solve/ds/util/ListNode.java
package com.bilqu.solve.ds.util;
=======
package com.bilqu.solve.ds;
>>>>>>> c998b556a9b06264fda0478daaea467a0952d22c:solve-it/src/main/java/com/bilqu/solve/ds/ListNode.java


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
