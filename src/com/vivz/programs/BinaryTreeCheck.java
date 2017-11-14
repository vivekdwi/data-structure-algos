package com.vivz.programs;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class BinaryTreeCheck {
    NodeClass rootNode;

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

    private boolean isBST(){
        return isBSTUtil(rootNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(NodeClass node, int min, int max){

        if(null == node)
            return true;

        if(node.data < min || node.data > max)
            return false;

        return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
    }
}
