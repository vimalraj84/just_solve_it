package com.bilqu.solve.prob.math;

import com.bilqu.solve.prob.ds.util.ListNode;

public class AddTwoNumbers{

    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode<Integer> listNode1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode<Integer> listNode2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        System.out.println(listNode1.toString());
        System.out.println(listNode2.toString());
        System.out.println(addTwoNumbers(listNode1,listNode2).toString());

    }

    public static ListNode addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> output = null;

        int temp = 0;
        int carryForward = 0;

        ListNode<Integer> node1 = l1;
        ListNode<Integer> node2 = l2;

        if(node1 != null)
            temp = temp+node1.getValue();
        if(node2 != null)
            temp = temp+node2.getValue();

        carryForward = temp/10;

        output = new ListNode(temp%10);
        ListNode currentNode =  output;

        while(node1.getNext() != null || node2.getNext() != null){
            temp = 0;

            temp = temp + carryForward;

            if(node1.getNext() != null){
                temp = temp+node1.getNext().getValue();
                node1 = node1.getNext();
            }
            if(node2.getNext() != null){
                temp = temp+node2.getNext().getValue();
                node2 = node2.getNext();
            }

            carryForward = temp/10;

            currentNode.setNext(new ListNode(temp%10));
            currentNode =  currentNode.getNext();

        }

        return output;
    }

}
