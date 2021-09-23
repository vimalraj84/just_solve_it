package com.bilqu.solve.ds.tree;

import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;

public class FlattenBinaryTree {

    public static void main(String[] args) {
        TreeNode_Int root = new TreeNode_Int(1,new TreeNode_Int(2, new TreeNode_Int(3), new TreeNode_Int(4)),new TreeNode_Int(5, null, new TreeNode_Int(6)));
        //1,2,3,4,5,6
        //1,null,2,null,3,null,4,null,5,null,6,null
        TreePrinter_Int.printNode(root);
        flatten(root);
        TreePrinter_Int.printNode(root);
    }

    private static void flatten(TreeNode_Int root){

        if(root ==null){
            return;
        }

        TreeNode_Int left = root.left;
        TreeNode_Int right = root.right;

        root.left=null;//always left node will be null in case of flatten tree
        root.right=left; //Assign right with left node

        TreeNode_Int current = root;

        while(current.right !=null) {
            current = current.right;
        }

        current.right =right;

        flatten(left);
        flatten(right);
    }
}
