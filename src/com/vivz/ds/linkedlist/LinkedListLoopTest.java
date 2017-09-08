package com.vivz.ds.linkedlist;

/**
 * {@link LinkedListLoopTest} Class Tests weather Linked List is
 * Cyclic or having loop in it.
 *
 * Java program to find if LinkedList contains loop or cycle or not.
 * * This example uses two pointer approach to detect cycle in linked
 * list. * Fast pointer moves two node at a time while slow pointer
 * moves one node. * If linked list contains any cycle or loop then
 * both pointer will meet some time.
 *
 * Created by vivekdwivedi on 9/8/2017.
 */
public class LinkedListLoopTest {
    public static void main(String[] args){
        LinkedListLoopFind lList = new LinkedListLoopFind();
        lList.appendToTail(new LinkedListLoopFind.Node("101"));
        lList.appendToTail(new LinkedListLoopFind.Node("201"));
        lList.appendToTail(new LinkedListLoopFind.Node("301"));
        lList.appendToTail(new LinkedListLoopFind.Node("401"));
        System.out.println("Linked List : " + lList);

        if(lList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }

        //creating LinkedList with 5 elements including head
        LinkedListLoopFind linkedList = new LinkedListLoopFind();
        linkedList.appendToTail(new LinkedListLoopFind.Node("101"));
        LinkedListLoopFind.Node cycle = new LinkedListLoopFind.Node("201");
        linkedList.appendToTail(cycle);
        linkedList.appendToTail(new LinkedListLoopFind.Node("301"));
        linkedList.appendToTail(new LinkedListLoopFind.Node("401"));
        linkedList.appendToTail(cycle);

        //don't call toString method in case of cyclic linked list, it will throw OutOfMemoryError
        //System.out.println("Linked List : " + linkedList);

        if(linkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }

    }
}
