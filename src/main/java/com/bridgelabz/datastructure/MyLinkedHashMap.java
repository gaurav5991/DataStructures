package com.bridgelabz.datastructure;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {

    private final int numBuckets;
    ArrayList<MyLinkedList> myBucketArray;

    /*Constructor*/
    public MyLinkedHashMap() {
        numBuckets = 10;
        myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++)
            this.myBucketArray.add(null);
    }

    /*Get bucket index for given key*/
    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }

    /* Get value given Key*/
    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null)
            return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchElement((Comparable) key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    /* Add to linked hash map*/
    public void add(K key, V value) {
        int index = getBucketIndex(key);
        MyLinkedList myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList();
            myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchElement((Comparable) key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<K, V>(key, value);
            myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    /* Remove the key-value pair for given key*/
    public V remove(K key) {
        int index = getBucketIndex(key);
        MyLinkedList myLinkedList = myBucketArray.get(index);
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchElement((Comparable) key);
        if (myMapNode != null) {
            V deletedValue = myMapNode.getValue();
            myLinkedList.popElement((Comparable) key);
            return deletedValue;
        } else
            return null;
    }
}
