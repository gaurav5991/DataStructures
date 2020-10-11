package com.bridgelabz.datastructure;

public class MyLinkedList<K> {
    private INode head;
    private INode tail;

    /*Constructor*/
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*Getter And Setter Methods*/
    public INode getHead() {
        return head;
    }

    public void setHead(INode head) {
        this.head = head;
    }

    public INode getTail() {
        return tail;
    }

    public void setTail(INode tail) {
        this.tail = tail;
    }

    /*Add Node in Linked List*/
    public void add(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /*Append Node in Linked List*/
    public void append(INode<K> newNode) {
        if (head == null)
            this.head = newNode;
        if (tail == null)
            this.tail = newNode;
        else {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    /*Insert Node in Linked List*/
    public void insert(INode<K> prevNode, INode<K> newNode) {
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
    }

    /*Pop First Node in Linked List*/
    public INode popFirst() {
       INode tempNode = this.head;
       this.head = head.getNext();
       return  tempNode;
    }
    /*Pop Last Node in Linked List*/
    public INode popLast() {
        INode prevNode =null;
        INode tempNode = this.head;
        while (tempNode.getNext()!=null){
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        prevNode.setNext(null);
        return tempNode;
    }
}
