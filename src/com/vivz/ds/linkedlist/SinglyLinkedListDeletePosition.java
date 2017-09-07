package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListDeletePosition} Class is an Example
 * of Deleting Node from LinkedList from Specific Position.
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class SinglyLinkedListDeletePosition {
    // head of list
    SinglyLinkedListDeletePosition.Node mHead;

    /**
     * Linked list Node.  This inner class is
     * made static so that main() can access it.
     */
    static class Node{
        int lData;
        SinglyLinkedListDeletePosition.Node lNext;

        Node(int pData){
            this.lData = pData;
            this.lNext = null;
        }
    }

    public static void main(String[] args){
        /* Start with the empty list */
        SinglyLinkedListDeletePosition lList = new SinglyLinkedListDeletePosition();

        lList.push(7);
        lList.push(1);
        lList.push(3);
        lList.push(2);
        lList.push(8);

        System.out.println("\nCreated Linked list is: ");
        lList.printList();

        // Delete node at position 4
        lList.deleteNode(4);

        System.out.println("\nLinked List after Deletion at position 4: ");
        lList.printList();
    }

    /**
     * deleteNode() Deletes the node at specific
     * position from Linked List
     *
     * @param pPosition
     */
    public void deleteNode(int pPosition){

        // If linked list is empty
        if(null == mHead)
            return;

        // Store head node
        Node lTemp = mHead;

        // If head needs to be removed
        if(0 == pPosition){
            // Change head
            mHead = lTemp.lNext;
            return;
        }

        // Find previous node of the node to be deleted
        for(int i=0; null != lTemp && i < pPosition-1; i++)
            lTemp = lTemp.lNext;


        // If position is more than number of nodes
        if(null == lTemp || null == lTemp.lNext)
            return;

        /**
         * Node lTemp->lNext is the node to be deleted
         * Store pointer to the next of node to be deleted
         */
        Node lNext = lTemp.lNext.lNext;

        // Unlink the deleted node from list
        lTemp.lNext = lNext;
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
        SinglyLinkedListDeletePosition.Node lNewNode = new SinglyLinkedListDeletePosition.Node(pNewData);
        lNewNode.lNext = mHead;
        mHead = lNewNode;
    }

    /**
     * printList() prints contents of linked
     * list starting from head
     */
    public void printList(){
        SinglyLinkedListDeletePosition.Node lNode = mHead;
        while(null != lNode){
            System.out.println("List Data :: "+lNode.lData);
            lNode = lNode.lNext;
        }
    }
}
