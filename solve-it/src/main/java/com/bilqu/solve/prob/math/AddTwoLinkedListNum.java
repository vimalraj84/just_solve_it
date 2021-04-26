package com.bilqu.solve.prob.math;


//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order and each of their nodes contain a single digit.
//Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
public class AddTwoLinkedListNum {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(2);
        ListNode n2  = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.setNext(n2);
        n2.setNext(n3);
        System.out.println(n1);

        ListNode f1 = new ListNode(5);
        ListNode f2  = new ListNode(6);
        ListNode f3 = new ListNode(4);
        f1.setNext(f2);
        f2.setNext(f3);
        System.out.println(f1);

        System.out.println(addTwoNumbers(n1,f1,0));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2,int rem) {
        ListNode  n1 = null;

        if(l1 != null && l2 != null){
            int sum = l1.val+l2.val ;
            n1 =  new ListNode(rem + sum);
            if(sum > 9){
                n1 .setVal((rem+ sum)%10);
                rem = sum/10;
            }
            n1.setNext(addTwoNumbers(l1.getNext(),l2.getNext(),rem));
        }
        return n1;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
