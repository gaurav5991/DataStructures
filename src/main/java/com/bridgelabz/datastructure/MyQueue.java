package com.bridgelabz.datastructure;

public class MyQueue<K> {
    private final MyLinkedList MyLinkedList;

    /*Constructor*/
    public MyQueue() {
        this.MyLinkedList = new MyLinkedList();
    }

    /*Enqueue Node in Queue*/
    public void enqueue(INode<K> newNode) {
        MyLinkedList.append(newNode);
    }

    /*Peek Element From Queue*/
    public INode<K> peek() {
        return MyLinkedList.getHead();
    }

    /*Print Queue*/
    public void printQueue() {
        MyLinkedList.printNodes();
    }

    /*Dequeue Element From Queue*/
    public INode<K> Dequeue() {
        return MyLinkedList.popFirst();
    }

}
