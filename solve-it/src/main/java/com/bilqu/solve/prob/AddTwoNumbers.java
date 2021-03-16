package com.bilqu.solve.prob;

public class AddTwoNumbers{

    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode listNode1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        System.out.println(listNode1.toString());
        System.out.println(listNode2.toString());
        System.out.println(addTwoNumbers(listNode1,listNode2).toString());

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = null;

        int temp = 0;
        int carryForward = 0;

        ListNode node1 = l1;
        ListNode node2 = l2;

        if(node1 != null)
            temp = temp+node1.val;
        if(node2 != null)
            temp = temp+node2.val;

        carryForward = temp/10;

        output = new ListNode(temp%10);
        ListNode currentNode =  output;

        while(node1.next != null || node2.next != null){
            temp = 0;

            temp = temp + carryForward;

            if(node1.next != null){
                temp = temp+node1.next.val;
                node1 = node1.next;
            }
            if(node2.next != null){
                temp = temp+node2.next.val;
                node2 = node2.next;
            }

            carryForward = temp/10;

            currentNode.next = new ListNode(temp%10);
            currentNode =  currentNode.next;

        }

        return output;
    }

    public static class ListNode {

        private int val;
        private ListNode next;


        public  ListNode(int value){
            this.val = value;
        }

        public ListNode ( int value, ListNode nextNode){
            this.val = value;
            this.next = nextNode;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "value=" + val +
                    ", nextNode=" + next +
                    '}';
        }
    }
}
