package com.bridgelabz.datastructure;

public class MyBinaryTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;
    /*Add Node in BST*/
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }
    /*Add Recursively*/
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    /*Get Size*/
    public int getSize() {
        return this.getSizeRecursive(root);
    }
    /*Get Size Recursively*/
    private int getSizeRecursive(MyBinaryNode<K> current) {
        return (current) == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }
    /* Search Node in Binary Tree*/
    public boolean search(K key) {
        return (searchRecursive(root, key) != null);
    }

    private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
        if (current == null)
            return null;
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.right, key);
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.left, key);
        else
            return current;

    }
}
