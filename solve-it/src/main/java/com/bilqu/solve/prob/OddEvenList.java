package com.bilqu.solve.prob;


import com.bilqu.solve.ds.util.ListNode;

public class OddEvenList {

    public static void main(String[] args) {

        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
        System.out.println("Input : "+ input);
        System.out.println("Output : " + getOddEvenList(input));

    }

    private static ListNode getOddEvenList(ListNode head){

        if(head == null)
            return  null;

        if(head.getNext() == null)
            return head;

        ListNode odd = head;  //At the end of blow loop its will point to the last odd node of the head
        ListNode even = head.next;
        ListNode evenHead = even; // At the end of the loop it will the head of the even list

        //Split the list into Odd and Even
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next=evenHead; //Append even list to the end of the odd list

        return head;
    }
}
