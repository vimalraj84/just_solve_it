package com.bilqu.solve.search;

import com.bilqu.solve.ds.util.ListNode;

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        ListNode input = new ListNode("A");
        input.setNext(new ListNode("B"));
        input.getNext().setNext(new ListNode("C"));

        System.out.println(findMiddleNode(input));

    }

    private static ListNode findMiddleNode(ListNode head){

        //Use Pointers
        ListNode slow_pointer = head; //junps one node at a time
        ListNode fast_pointer = head; //jumps two node at a time

        //this condition means it reaches the end of the list
        while (fast_pointer != null && fast_pointer.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;

        }
        return slow_pointer; //when the fast_pointer reaches the end slow_pointer will be in the middle.

    }
}
