package com.bridgelabz.datastructure;

import java.security.Key;

public class MyNode<K> implements INode<K> {
    private  INode next;
    private  K key;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public boolean printWelcomeMessage() {
        System.out.println("Welcome To Linear Data Structure!!!");
        return true;
    }
}
