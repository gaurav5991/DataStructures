package com.bridgelabz.datastructure;

public interface INode<K> {
    INode getNext();
    void setNext(INode next);

    K getKey();
    void setKey(K key);
}
