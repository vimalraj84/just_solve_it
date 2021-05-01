package com.bilqu.solve.ds;

import com.bilqu.solve.ds.util.TreeNode;
import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;

public class InvertTree {

    public static void main(String[] args) {

        TreeNode_Int root = new TreeNode_Int(4,new TreeNode_Int(2, new TreeNode_Int(1), new TreeNode_Int(3)),new TreeNode_Int(7, new TreeNode_Int(6), new TreeNode_Int(9)));

        TreePrinter_Int.printNode(root);

        TreeNode_Int output = invertor(root);
        TreePrinter_Int.printNode(output);
    }

    private static TreeNode_Int invertor(TreeNode_Int root){

        if(root == null){
            return null;
        }

        TreeNode_Int left = invertor(root.left);
        TreeNode_Int right = invertor(root.right);

        root.right = left;
        root.left = right;

        return root;

    }
}
