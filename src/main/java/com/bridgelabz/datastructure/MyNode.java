package com.bridgelabz.datastructure;

public class MyNode<K> {
    private  MyNode next;
    private  K key;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public boolean printWelcomeMessage() {
        System.out.println("Welcome To Linear Data Structure!!!");
        return true;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
