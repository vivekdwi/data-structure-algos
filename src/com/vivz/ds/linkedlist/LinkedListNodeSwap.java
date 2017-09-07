package com.vivz.ds.linkedlist;

/**
 * {@link LinkedListNodeSwap} Class is an Example of
 * Swapping Nodes without Swapping Data.
 *
 * Given a linked list and two keys in it, swap nodes for two
 * given keys. Nodes should be swapped by changing links. Swapping
 * data of nodes may be expensive in many situations when data
 * contains many fields. It may be assumed that all keys in linked
 * list are distinct.
 *
 * Node1 and Node2 may or may not be adjacent.
 * Either Node1 or Node2 may be a head node.
 * Either Node1 or Node2 may be last node.
 * Node1 and/or Node2 may not be present in linked list.
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class LinkedListNodeSwap {
    // head of list
    LinkedListNode mHead;

    public static void main(String[] args){
        LinkedListNodeSwap lList = new LinkedListNodeSwap();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        lList.push(7);
        lList.push(6);
        lList.push(5);
        lList.push(4);
        lList.push(3);
        lList.push(2);
        lList.push(1);

        System.out.print("\n Linked list before calling swapNodes() ");
        lList.printList();

        lList.swapNodes(4,3);

        System.out.print("\n Linked list after calling swapNodes() ");
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
        LinkedListNode lNewNode = new LinkedListNode(pNewData);
        lNewNode.mNext = mHead;
        mHead = lNewNode;
    }

    /**
     * printList() prints contents of linked
     * list starting from head
     */
    public void printList(){
        LinkedListNode lNode = mHead;
        while(null != lNode){
            System.out.println("List Data :: "+lNode.mData);
            lNode = lNode.mNext;
        }
    }

    /**
     * swapNodes() Swaps the Nodes in
     * Linked List without Swapping Data.
     *
     * @param pNode1
     * @param pNode2
     */
    public void swapNodes(int pNode1, int pNode2){

        // Nothing to do if pNode1 and pNode2 are same
        if(pNode1 == pNode2)
            return;

        // Search for pNode1 (keep track of lPrevNode1 and lCurrNode1)
        LinkedListNode lPrevNode1 = null, lCurrNode1 = mHead;
        while(null != lCurrNode1 && lCurrNode1.mData == pNode1){
            lPrevNode1 = lCurrNode1;
            lCurrNode1 = lCurrNode1.mNext;
        }

        // Search for pNode2 (keep track of lPrevNode2 and lCurrNode2)
        LinkedListNode lPrevNode2 = null, lCurrNode2 = mHead;
        while(null != lCurrNode2 && lCurrNode2.mData == pNode2){
            lPrevNode2 = lCurrNode2;
            lCurrNode2 = lCurrNode2.mNext;
        }

        // If either pNode1 or pNode2 is not present, nothing to do
        if(null == lCurrNode1 || null == lCurrNode2)
            return;

        // If pNode1 is not head of linked list
        if(null != lPrevNode1)
            lPrevNode1.mNext = lCurrNode2;
        else //make pNode2 the new head
            mHead = lCurrNode2;

        // If pNode2 is not head of linked list
        if(null != lPrevNode2)
            lPrevNode2.mNext = lCurrNode1;
        else // make pNode1 the new head
            mHead = lCurrNode1;

        // Swap next pointers
        LinkedListNode lTemp = lCurrNode1.mNext;
        lCurrNode1.mNext = lCurrNode2.mNext;
        lCurrNode2.mNext = lTemp;
    }
}

/**
 * {@link LinkedListNode} Class is used to
 * create Nodes in LinkedList.
 */
class LinkedListNode{
    int mData;
    LinkedListNode mNext;

    LinkedListNode(int pData){
        this.mData = pData;
        this.mNext = null;
    }
}
