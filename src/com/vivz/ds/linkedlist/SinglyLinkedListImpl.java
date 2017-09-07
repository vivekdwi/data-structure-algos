package com.vivz.ds.linkedlist;

/**
 * {@link SinglyLinkedListImpl} class is an Example of
 * Single LinkedList Implementation.
 *
 * In this example, LinkedList can be represented as a
 * class and a Node as a separate class. The LinkedList
 * class contains a reference of Node class type.
 *
 * Created by vivekdwivedi on 9/7/2017.
 */
public class SinglyLinkedListImpl{

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
        /* Start with the empty list. */
        SinglyLinkedListImpl lLinkedList = new SinglyLinkedListImpl();

         /* Three nodes have been allocated  dynamically.
          We have references to these three blocks as first,
          second and third

          lLinkedList.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */
        lLinkedList.mHead = new Node(1);
        Node lSecond = new Node(2);
        Node lThird = new Node(3);

        // Link first node with the second node
        lLinkedList.mHead.lNext = lSecond;

        /*  Now next of first Node refers to second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        // Link second node with the third node
         /*  Now next of second Node refers to third.  So all three
            nodes are linked.

         lLinkedList.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        lSecond.lNext = lThird;
    }
}
