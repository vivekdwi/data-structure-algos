package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListInsertion} Class is an Example
 * of Insertion Logic of Node in Starting, End and Middle
 * of Nodes in Linked List.
 *
 * Created by Sapient on 9/7/2017.
 */
public class SinglyLinkedListInsertion {

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
            lNext = null;
        }
    }

    public static void main(String[] args){
        /* Start with the empty list */
        SinglyLinkedListInsertion lList = new SinglyLinkedListInsertion();

        // Insert 6.  So linked list becomes 6->NUllList
        lList.insertEnd(6);

        /* Insert 7 at the beginning. So linked list becomes
           7->6->NUllList*/
        lList.push(7);

        /* Insert 1 at the beginning. So linked list becomes
           1->7->6->NUllList*/
        lList.push(1);

        /* Insert 4 at the end. So linked list becomes
           1->7->6->4->NUllList*/
        lList.insertEnd(4);

        /* Insert 8, after 7. So linked list becomes
           1->7->8->6->4->NUllList*/
        lList.insertAfter(lList.mHead.lNext,8);

        System.out.println("Created Linked List :: ");
        lList.printList();

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
        Node lNewNode = new Node(pNewData);
        lNewNode.lNext = mHead;
        mHead = lNewNode;
    }

    /**
     * insertAfter() Inserts a new node after the given pPrevNode.
     * Time complexity of insertAfter() is O(1) as it does
     * constant amount of work.
     *
     * @param pPrevNode
     * @param pNewData
     */
    public void insertAfter(Node pPrevNode, int pNewData){

        /* 1. Check if the given Node is null */
        if(null == pPrevNode){
            System.err.println("The given previous node is null");
            return;
        }

        /* 2. Allocate the Node &
           3. Put in the data*/
        Node lNewNode = new Node(pNewData);
        /* 4. Make next of new Node as next of pPrevNode */
        lNewNode.lNext = pPrevNode.lNext;
        /* 5. make next of pPrevNode as lNewNode */
        pPrevNode.lNext = lNewNode;
    }

    /**
     * insertEnd() Appends a new node at the end.
     *
     * @param pNewData
     */
    public void insertEnd(int pNewData){
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node lNewNode = new Node(pNewData);

        /* 4. If the Linked List is empty, then make the
           new node as head */
        if(mHead == null){
            mHead = new Node(pNewData);
            return;
        }

        /* 4. This new node is going to be the last node, so
         make next of it as null */
        lNewNode.lNext = null;

        /* 5. Else traverse till the last node */
        Node lLastNode = mHead;
        while(null != lLastNode.lNext)
            lLastNode = lLastNode.lNext;

        /* 6. Change the next of last node */
        lLastNode.lNext = lNewNode;
        return;
    }

    /**
     * printList() prints contents of linked
     * list starting from head
     */
    public void printList(){
        Node lNode = mHead;
        while(null != lNode){
            System.out.println("List Data :: "+lNode.lData);
            lNode = lNode.lNext;
        }
    }
}
