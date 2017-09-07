package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListTraversal} Class is
 * an Example of Traversing LinkedList starting
 * from Head.
 *
 * Created by Sapient on 9/7/2017.
 */
public class SinglyLinkedListTraversal {

    Node mHead;

    /**
     * Linked list Node.  This inner class is
     * made static so that main() can access it.
     */
    static class Node{
        int lData;
        Node lNext;

        Node(int pData){
            this.lData = pData;
            lNext = null;
        }
    }

    /**
     * printList() prints contents of linked
     * list starting from head
     */
    private void printList(){
        Node lNode = mHead;
        while (lNode != null){
            System.out.println("List Data :: "+lNode.lData);
            lNode = lNode.lNext;
        }
    }

    /**
     * main() method to create a simple linked list
     * with 3 nodes
     *
     * @param args
     */
    public static void main(String[] args){
        /* Start with the empty list. */
        SinglyLinkedListTraversal lList = new SinglyLinkedListTraversal();
        lList.mHead = new Node(1);
        Node lSecond = new Node(2);
        Node lThird = new Node(3);
        // Link first node with the second node
        lList.mHead.lNext = lSecond;
        // Link second node with the third node
        lSecond.lNext = lThird;
        lList.printList();
    }
}
