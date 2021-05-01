package com.bilqu.solve.ds.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePrinter_Int{
	public static void printNode(TreeNode_Int root) {
        int maxLevel = TreePrinter_Int.higherLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printNodeInternal(List<TreeNode_Int> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || TreePrinter_Int.checkAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        TreePrinter_Int.printWhitespaces(firstSpaces);

        List<TreeNode_Int> newNodes = new ArrayList<>();
        for (TreeNode_Int node : nodes) {
            if (node != null) {
                System.out.print(node.root);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            TreePrinter_Int.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                TreePrinter_Int.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    TreePrinter_Int.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    TreePrinter_Int.printWhitespaces(1);

                TreePrinter_Int.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    TreePrinter_Int.printWhitespaces(1);

                TreePrinter_Int.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <T> int higherLevel(TreeNode_Int node) {
        if (node == null)
            return 0;

        return Math.max(TreePrinter_Int.higherLevel(node.left), TreePrinter_Int.higherLevel(node.right)) + 1;
    }

    private static <T> boolean checkAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}
