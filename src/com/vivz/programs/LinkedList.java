package com.vivz.programs;

/**
 * {@link LinkedList} Class is an Example of
 * Creating Linked List and Adding Node in
 * Linked List
 *
 * Created by vivekdwivedi on 9/8/2017.
 */
public class LinkedList {

    private Node mHead;
    private Node mTail;

    public LinkedList(){
        this.mHead = new Node("head");
        mTail = mHead;
    }

    public Node getHead() {
        return mHead;
    }

    /**
     * addNode() adds the Node in Linked
     * List.
     *
     * @param pNode
     */
    public void addNode(Node pNode){
        mTail.mNext = pNode;
        mTail = pNode;
    }

    /**
     * {@link Node} is Inner Class to create
     * Nodes of Linked List
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
