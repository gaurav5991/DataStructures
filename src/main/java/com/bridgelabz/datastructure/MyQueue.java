package com.bridgelabz.datastructure;

public class MyQueue<K> {
    private final MyLinkedList MyLinkedList;

    /*Constructor*/
    public MyQueue() {
        this.MyLinkedList = new MyLinkedList();
    }

    /*Push Node in Queue*/
    public void enqueue(INode<K> newNode) {
        MyLinkedList.append(newNode);
    }

    /*Peek Element From Stack*/
    public INode<K> peek() {
        return MyLinkedList.getHead();
    }

    /*Print Stack*/
    public void printQueue() {
        MyLinkedList.printNodes();
    }

}
