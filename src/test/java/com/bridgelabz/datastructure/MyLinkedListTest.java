package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.getHead().equals(myThirdNode) &&
                         myLinkedList.getHead().getNext().equals(mySecondNode) &&
                         myLinkedList.getTail().equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToBottom() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                         myLinkedList.getHead().getNext().equals(mySecondNode) &&
                         myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
