package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListDeletion} Class is an Example
 * of Deleting the Nodes From LinkedList based on keys
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class SinglyLinkedListDeletion {

    // head of list
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
            this.lNext = null;
        }
    }

    public static void main(String[] args){
        SinglyLinkedListDeletion lList = new SinglyLinkedListDeletion();
        lList.push(7);
        lList.push(1);
        lList.push(3);
        lList.push(2);

        System.out.println("\nCreated Linked list is:");
        lList.printList();

        lList.deleteNode(1); // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4:");
        lList.printList();
    }

    /**
     * deleteNode() deletes the first Occurrence
     * of key in LinkedList
     *
     * @param pKey
     */
    public void deleteNode(int pKey){
        // Store head node
        Node lTemp = mHead, lPrev = null;

        // If head node itself holds the key to be deleted
        if(null != lTemp && lTemp.lData == pKey){
            mHead = lTemp.lNext;
            return;
        }

        /**
         * Search for the key to be deleted, keep track
         * of the previous node as we need to change
         * lTemp.lNext
         */
        while (null != lTemp && lTemp.lData != pKey){
            lPrev = lTemp;
            lTemp = lTemp.lNext;
        }

        // If key was not present in linked list
        if(null == lTemp)
            return;

        // Unlink the node from linked list
        lPrev.lNext = lTemp.lNext;
    }

    /**
     * This function is in LinkedList class. Inserts
     * a new Node at front of the list.
     * Time complexity of push() is O(1) as it does
     * constant amount of work.
     *
     * @param pNewData
     */
    public void push(int pNewData){
        SinglyLinkedListDeletion.Node lNewNode = new SinglyLinkedListDeletion.Node(pNewData);
        lNewNode.lNext = mHead;
        mHead = lNewNode;
    }

    /**
     * printList() prints contents of linked
     * list starting from head
     */
    public void printList(){
        SinglyLinkedListDeletion.Node lNode = mHead;
        while(null != lNode){
            System.out.println("List Data :: "+lNode.lData);
            lNode = lNode.lNext;
        }
    }
}
