package com.bridgelabz.datastructure;

public class MyLinkedList<K extends Comparable<K>> {
    private INode<K> head;
    private INode<K> tail;

    /*Constructor*/
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*Getter And Setter Methods*/
    public INode<K> getHead() {
        return head;
    }

    public void setHead(INode<K> head) {
        this.head = head;
    }

    public INode<K> getTail() {
        return tail;
    }

    public void setTail(INode<K> tail) {
        this.tail = tail;
    }

    /*Add Node in Linked List*/
    public void add(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> tempNode = this.head;
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
    public INode<K> popFirst() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /*Pop Last Node in Linked List*/
    public INode<K> popLast() {
        INode<K> prevNode = null;
        INode<K> tempNode = this.head;
        while (tempNode.getNext() != null) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        prevNode.setNext(null);
        return tempNode;
    }

    /*Search element in linked list with given value*/
    public INode<K> searchElement(K key) {
        INode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    /*Delete Specified Element From Linked List After given Element*/
    public INode<K> popElement(K key) {
        INode<K> prevNode = null;
        INode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                prevNode.setNext(tempNode.getNext());
                return tempNode;
            }
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    /*Calculate size of Linked List*/
    public int size() {
        int size = 0;
        INode<K> tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    /*Add Node in Sorted Linked List*/
    public void addElementInSortedList(INode<K> newNode) {
        INode<K> tempNode = head;
        INode<K> prevNode = null;
        while (tempNode != null && newNode.getKey().compareTo(tempNode.getKey()) > 0) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(tempNode);
        while (tempNode!=null){
            this.tail = tempNode;
            tempNode = tempNode.getNext();
        }
    }
    /*Print Nodes of Linked List*/
    public void printNodes() {
        INode tempNode = this.head;
        while(tempNode!=null){
            System.out.print(tempNode.getKey()+" ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
}
