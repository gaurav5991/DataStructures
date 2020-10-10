package com.bridgelabz.datastructure;

public class MyLinkedList<K> {
    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

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

    public void add(INode<K> newNode) {
        if(this.tail==null)
            this.tail = newNode;
        if(this.head == null)
            this.head = newNode;
        else {
           INode tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode);
        }
    }
    public void append(INode<K> newNode){
        if(head ==null)
            this.head = newNode;
        if(tail == null)
            this.tail = newNode;
        else{
            while (tail.getNext()!=null){
                tail = tail.getNext();
            }
            tail.setNext(newNode);
            this.tail = null;
        }
    }
}
