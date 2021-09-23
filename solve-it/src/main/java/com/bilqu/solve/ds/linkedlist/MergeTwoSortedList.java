package com.bilqu.solve.ds.linkedlist;

public class MergeTwoSortedList {

    public static void main(String[] args) {

        //Input: l1 = [1,2,4], l2 = [1,3,4]
        //Output: [1,1,2,3,4,4]

        ListNode l1 = new ListNode(1, new ListNode (2, new ListNode (4)));
        ListNode l2 = new ListNode(1, new ListNode (3, new ListNode (4)));
        System.out.println(mergeTwoLists(l1,l2).toString());
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode merged = temp;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                merged.next = l1;
                l1 = l1.next;
            }else{
                merged.next = l2;
                l2 = l2.next;
            }

            merged = merged.next;
        }

        if(l1 != null){
            merged.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            merged.next = l2;
            l2 = l2.next;
        }

        return temp.next;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
