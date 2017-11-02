package com.vivz.programs;

/**
 * {@link LinkedListMiddleElementTest} Class is an Example of
 * Finding Middle Element of Linked List
 *
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 *
 * Created by vivekdwivedi on 9/8/2017.
 */
public class LinkedListMiddleElementTest {
    public static void main(String[] args){
        int length = 0;

        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.getHead();
        linkedList.addNode( new LinkedList.Node("1"));
        linkedList.addNode( new LinkedList.Node("2"));
        linkedList.addNode( new LinkedList.Node("3"));
        linkedList.addNode( new LinkedList.Node("4"));

        //finding middle element of LinkedList in single pass
        LinkedList.Node lCurrent = head;
        LinkedList.Node lMiddle = head;

        while(null != lCurrent.getNext()){
            length++;
            if(length%2 == 0){
                lMiddle = lMiddle.getNext();
            }
            lCurrent = lCurrent.getNext();
        }

        if(length%2 ==1){
            lMiddle = lMiddle.getNext();
        }

        System.out.println("Length of Linked List :: "+length);
        System.out.println("Middle Element Of Linked List :: "+lMiddle);
    }
}
