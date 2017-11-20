package com.vivz.programs;

/**
 * {@link BinaryTreeTest} class is a Test Class
 * for Binary Tree Data Structure.
 *
 * Created by vivekdwivedi on 11/20/2017.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTreeCheck tree = new BinaryTreeCheck();
        tree.rootNode = new BinaryTreeCheck.NodeClass(4);
        tree.rootNode.left = new BinaryTreeCheck.NodeClass(2);
        tree.rootNode.right = new BinaryTreeCheck.NodeClass(5);
        tree.rootNode.left.left = new BinaryTreeCheck.NodeClass(9);
        tree.rootNode.left.right = new BinaryTreeCheck.NodeClass(3);

        System.out.println(tree.getLevel(tree.rootNode,10));
    }
}
