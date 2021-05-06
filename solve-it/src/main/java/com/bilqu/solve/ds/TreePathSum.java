package com.bilqu.solve.ds;

import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;

import java.util.Stack;

public class TreePathSum {

    public static void main(String[] args) {
        TreeNode_Int t1 = new TreeNode_Int(5);
        t1.left = new TreeNode_Int(4, new TreeNode_Int(11, new TreeNode_Int(7), new TreeNode_Int(2)),null);
        t1.right = new TreeNode_Int(8, new TreeNode_Int(13), new TreeNode_Int(4, null,new TreeNode_Int(1)));

        TreePrinter_Int.printNode(t1);
        System.out.println(hasPathSum(t1,22));

    }

    private static boolean hasPathSum(TreeNode_Int root, int sum){

        if(root == null)
            return false;

        if(sum == 0 )
            return false;

        Stack<TreeNode_Int> node_stack = new Stack<>();
        Stack<Integer> sum_stack = new Stack<>();

        node_stack.push(root);
        sum_stack.push(sum-root.root);

        while (!node_stack.isEmpty()){

            TreeNode_Int current_node = node_stack.pop();
            int current_sum = sum_stack.pop();

            if(current_node.left == null && current_node.right == null && current_sum == 0){
                return true;
            }

            if(current_node.left != null){
                node_stack.push(current_node.left);
                sum_stack.push(current_sum - current_node.left.root);
            }

            if(current_node.right != null){
                node_stack.push(current_node.right);
                sum_stack.push(current_sum - current_node.right.root);
            }
        }

        return  false;
    }

}
