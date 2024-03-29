package com.bilqu.solve.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;

        Node node3 = new Node(3);
        List<Node> child2 = new ArrayList<>();
        child2.add(new Node(5));
        child2.add(new Node(6));
        node3.children = child2;

        List<Node> child = new ArrayList<>();
        child.add(node3);
        child.add(new Node(2));
        child.add(new Node(4));
        root.children = child;

        System.out.println(root); //1,[3,[5,null, 6,null], 2,null, 4,null]
        System.out.println(inOrder(root));//[1,3,2,4,5,6]
    }

    private static List<Integer> inOrder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output =  new LinkedList<>();

        stack.add(root);

        while(!stack.isEmpty()){

            Node node = stack.poll();
            output.add(node.val);

            if(node.children != null && !node.children.isEmpty()){
                for(Node nd : node.children){
                    stack.add(nd);
                }
            }
        }
        return output;
    }

    //Node
    public static class Node{
        public  int val;
        public List<Node> children;

        public Node(){}
        public Node(int val){
            this.val = val;
        }

        public Node(int val, List<Node> children){
            this.val = val;
            this.children = children;
        }

        @Override
        public String toString() {
            return val +"," +children ;
        }
    }

}
