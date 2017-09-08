package com.vivz.ds.linkedlist;

/**
 * {@link LinkedListLoopFind} Class is an Example
 * of Finding Loop in a Single Linked List
 *
 * Two pointers, fast and slow is used while iterating over
 * linked list. Fast pointer moves two nodes in each iteration,
 * while slow pointer moves to one node. If linked list contains
 * loop or cycle than both fast and slow pointer will meet at some
 * point during iteration. If they don't meet and fast or slow will
 * point to null, then linked list is not cyclic and it doesn't
 * contain any loop.
 *
 * The Algorithm for this problem is :
 *
 * Use two pointers fast and slow
 * Move fast two nodes and slow one node in each iteration
 * If fast and slow meet then linked list contains cycle
 * If fast points to null or lFast.mNext points to null then linked list is not cyclic
 *
 * Created by vivekdwivedi on 9/8/2017.
 */
public class LinkedListLoopFind {
    private Node mHead;

    public LinkedListLoopFind(){
        this.mHead = new Node("head");
    }

    public Node getHead() {
        return mHead;
    }

    /**
     * appendToTail() Appends the Node into
     * Tail in Linked List
     *
     * @param pNode
     */
    public void appendToTail(Node pNode){
        Node lCurrent = mHead;

        //find last element of LinkedList i.e. tail
        while(null != lCurrent.getNext()){
            lCurrent = lCurrent.getNext();
        }

        //appending new node to tail in LinkedList
        lCurrent.setNext(pNode);
    }

    /**
     * If singly LinkedList contains Cycle then following would be
     * true slow and fast will point to same node i.e. they meet *
     * On the other hand if fast will point to null or next node of
     * * fast will point to null then LinkedList does not contains
     * cycle.
     *
     * @return
     */
    public boolean isCyclic(){
        Node lFast = mHead;
        Node lSlow = mHead;

        while(null != lFast && null != lFast.mNext){
            lFast = lFast.mNext.mNext;
            lSlow = lSlow.mNext;

            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(lFast == lSlow)
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * Overridden toString() which returns result in
     * 101-->201-->301-->401 way
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder lBuilder = new StringBuilder();
        Node lCurrent = mHead.getNext();

        while(null != lCurrent){
            lBuilder.append(lCurrent).append("-->");
            lCurrent = lCurrent.getNext();
        }

        lBuilder.delete(lBuilder.length()-3,lBuilder.length());
        return lBuilder.toString();
    }

    /**
     * {@link Node} Class is used to
     * create Nodes in LinkedList.
     */
    public static class Node{
        private Node mNext;
        private String mData;

        Node(String pData){
            this.mData = pData;
            this.mNext = null;
        }

        public Node getNext() {
            return mNext;
        }

        public void setNext(Node pNext) {
            mNext = pNext;
        }

        public String getData() {
            return mData;
        }

        public void setData(String pData) {
            mData = pData;
        }

        @Override
        public String toString() {
            return this.mData;
        }
    }
}
