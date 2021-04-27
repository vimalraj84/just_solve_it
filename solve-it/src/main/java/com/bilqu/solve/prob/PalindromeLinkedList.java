package com.bilqu.solve.prob;


import com.bilqu.solve.ds.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode<Integer> linkedList = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(linkedList);
        System.out.print(isPalindrome(linkedList));
    }

    private static boolean isPalindrome(ListNode<Integer> input){

        ListNode slow = input;
        ListNode fast = input;

        while( fast != null && fast.getNext() != null){
            slow.setNext(input.getNext());
            fast.setNext(input.getNext().getNext());
        }

        slow = reverse(slow);
        fast = input;

        while(slow != null){
            if(slow.getValue() != fast.getValue())
                return false;
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return false;
    }

    private static ListNode<Integer> reverse(ListNode<Integer> input){

        ListNode<Integer> prev = null;

        while(input != null){
            ListNode<Integer> next = input.getNext();
            input.setNext(prev);
            prev = input;
            input = next;
        }
        return prev;
    }
}
