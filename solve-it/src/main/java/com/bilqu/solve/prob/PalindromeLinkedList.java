package com.bilqu.solve.prob;


import com.bilqu.solve.ds.util.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        //1 -> 2 -> 3 -> 1 -> 2 -> 3 -> null
        ListNode<Integer> linkedList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2,new ListNode(1))))));
        System.out.println(isPalindrome(linkedList));
    }

    private static boolean isPalindrome(ListNode<Integer> input){
        System.out.println("INPUT:" + input);

        ListNode slow = input;
        ListNode fast = input;

        while( fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        System.out.println("before reverse : "+ slow);
        slow = reverse(slow);
        fast = input;

        System.out.println("slow before compare : "+ slow);
        System.out.println("fast before compare : "+ fast);
        while(slow != null){
            if(slow.getValue() != fast.getValue())
                return false;
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return true;
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
