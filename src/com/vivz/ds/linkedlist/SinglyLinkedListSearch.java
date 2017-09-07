package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListSearch} Class is an Example
 * of Search the Node Value in LinkedList.
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class SinglyLinkedListSearch {
    // head of list
    ListNode mHead;

    public static void main(String[] args){
        //Start with the empty list
        SinglyLinkedListSearch lList = new SinglyLinkedListSearch();

        /*Use push() to construct below list
        14->21->11->30->10  */
        lList.push(10);
        lList.push(30);
        lList.push(11);
        lList.push(21);
        lList.push(14);

        if (lList.search(lList.mHead, 11))
            System.out.println("Data is Present in LinkedList");
        else
            System.out.println("Data is not in LinkedList");
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
        ListNode lNewNode = new ListNode(pNewData);
        lNewNode.mNext = mHead;
        mHead = lNewNode;
    }

    /**
     * search() Search the Data in LinkedList
     *
     * @param pHead
     * @param pData
     * @return
     */
    public boolean search(ListNode pHead, int pData){
        ListNode lCurrent = pHead;

        while(null != lCurrent){
            if(lCurrent.mData == pData)
                return Boolean.TRUE;
            lCurrent = lCurrent.mNext;
        }
        return Boolean.FALSE;
    }
}

/**
 * {@link ListNode} Class is used to
 * create Nodes in LinkedList.
 */
class ListNode{
    int mData;
    ListNode mNext;
    ListNode(int pData){
        this.mData = pData;
        this.mNext = null;
    }
}
