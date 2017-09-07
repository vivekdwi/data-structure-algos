package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListLength} Class is an Example
 * of LinkedList which counts the numbers of Nodes in
 * LinkedList.
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class SinglyLinkedListLength {
    // head of list
    Node mHead;

    public static void main(String[] args){
        /* Start with the empty list */
        SinglyLinkedListLength lList = new SinglyLinkedListLength();
        lList.push(1);
        lList.push(3);
        lList.push(1);
        lList.push(2);
        lList.push(1);

        System.out.println("Count of nodes is " +
                lList.getCount());
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
        lNewNode.mNext = mHead;
        mHead = lNewNode;
    }

    /**
     * getCount() returns the Counts of
     * Nodes of LinkedList
     *
     * @return
     */
    public int getCount(){
        Node lTemp = mHead;
        int lCount = 0;
        while(null != lTemp){
            lCount++;
            lTemp = lTemp.mNext;
        }

        return lCount;
    }
}

/**
 * {@link Node} class is used to Create
 * the Nodes of Linked List
 */
class Node{
    int mData;
    Node mNext;
    Node(int pData){
        this.mData = pData;
        this.mNext = null;
    }
}
