package com.bridgelabz.datastructure;

public class MyHashMap<K extends Comparable<K>, V> {

    MyLinkedList<K> MyLinkedList;

    /*Constructor*/
    public MyHashMap() {
        MyLinkedList = new MyLinkedList();
    }

    /*Get Node Value*/
    public V get(K word) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.MyLinkedList.searchElement(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    /*Add Node*/
    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.MyLinkedList.searchElement(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.MyLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + MyLinkedList + '}';
    }
}
