package com.vivz.programs;

/**
 * {@link LinkedListMiddleElementTest} Class is an Example of
 * Finding Middle Element of Linked List
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
