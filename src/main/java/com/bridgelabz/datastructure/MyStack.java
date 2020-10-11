package com.bridgelabz.datastructure;

public class MyStack<K extends Comparable<K>> {

    private final MyLinkedList<K> MyLinkedList;

    /*Constructor*/
    public MyStack() {
        this.MyLinkedList = new MyLinkedList<K>();
    }

    /*Push Element in Stack*/
    public void push(INode<K> newNode) {
        MyLinkedList.add(newNode);
    }

    /*Peek Element From Stack*/
    public INode<K> peak() {
        return MyLinkedList.getHead();
    }

    /*Print Stack*/
    public void printStack() {
        MyLinkedList.printNodes();
    }

    /*Pop Element From Stack*/
    public INode<K> pop() {
        return MyLinkedList.popFirst();
    }
}
