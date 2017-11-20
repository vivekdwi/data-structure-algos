package com.vivz.programs;

/**
 * {@link BinaryTreeCheck} class is an Example of
 * Binary Tree Check, Level of given elements from
 * Binary Tree.
 *
 * Created by vivekdwivedi on 11/14/2017.
 */
public class BinaryTreeCheck {
    NodeClass rootNode;

    /**
     * {@link NodeClass} is Static Inner Class
     * For Binary Tree Nodes Creations
     */
    static class NodeClass{
        int data;
        NodeClass left, right;

        public NodeClass(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTreeCheck tree = new BinaryTreeCheck();
        tree.rootNode = new NodeClass(4);
        tree.rootNode.left = new NodeClass(2);
        tree.rootNode.right = new NodeClass(5);
        tree.rootNode.left.left = new NodeClass(9);
        tree.rootNode.left.right = new NodeClass(3);

        if(tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("IS NOT BST");
    }

    /**
     * isBST() checks that the given Tree is Binary Tree
     * or Not.
     *
     * @return
     */
    private boolean isBST(){
        return isBSTUtil(rootNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    /**
     * This Util Method is used for checking weather given tree
     * is Binary Tree or Not Using Recursion Logic.
     *
     * @param node
     * @param min
     * @param max
     * @return
     */
    private static boolean isBSTUtil(NodeClass node, int min, int max){

        if(null == node)
            return true;

        if(node.data < min || node.data > max)
            return false;

        return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
    }

    /**
     * This Method Returns the Element Level in Binary Tree
     *
     * @param node
     * @param data
     * @return
     */
    public int getLevel(NodeClass node, int data){
        return getLevelUtil(node,data,1);
    }

    /**
     * This Util method is used by getLevel() method
     * to find out the level of given element from the
     * Binary Tree.
     *
     * @param node
     * @param data
     * @param level
     * @return
     */
    public int getLevelUtil(NodeClass node, int data, int level){
        if(null == node)
            return 0;

        if(node.data == data)
            return level;

        int downLevel = getLevelUtil(node.left,data, level+1);
        if(downLevel != 0)
            return downLevel;

        downLevel = getLevelUtil(node.right,data,level +1);
        return downLevel;
    }
}
