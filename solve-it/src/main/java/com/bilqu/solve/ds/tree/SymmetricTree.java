package com.bilqu.solve.ds.tree;

import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode_Int t1 = new TreeNode_Int(1);
        t1.left = new TreeNode_Int(2, new TreeNode_Int(3), new TreeNode_Int(4));
        t1.right = new TreeNode_Int(2, new TreeNode_Int(4), new TreeNode_Int(3));

        TreePrinter_Int.printNode(t1);
        System.out.println(isSymmetric(t1));

        TreeNode_Int t2 = new TreeNode_Int(1);
        t2.left = new TreeNode_Int(2,new TreeNode_Int(4),new TreeNode_Int(3));
        t2.right = new TreeNode_Int(3,null,new TreeNode_Int(3,new TreeNode_Int(4,null, new TreeNode_Int(4)),null));

        TreePrinter_Int.printNode(t2);

        System.out.println(isSymmetric(t2));
    }

    private static boolean isSymmetric(TreeNode_Int root){
       return isMirror(root,root);
    }

    private static boolean isMirror(TreeNode_Int t1, TreeNode_Int t2){

        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;

        return ((t1.root == t2.root) && isMirror(t1.left,t2.right) && isMirror(t1.right, t2.left));

    }

}
