package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    /*TestCase for Element Added in Linked List*/
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

    /*TestCase for Element Appended in LinkedList*/
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

    /*TestCase for Element Inserted in Linked List*/
    @Test
    public void givenThreeNumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    /*TestCase for Deleting Head Node in LinkedList*/
    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode deletedNode = myLinkedList.popFirst();
        Assert.assertEquals(myFirstNode, deletedNode);
    }

    /*TestCase for Deleting Tail Node in LinkedList*/
    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode deletedNode = myLinkedList.popLast();
        Assert.assertEquals(myThirdNode, deletedNode);
    }

    /*TestCase for Searching Node with given Key in LinkedList*/
    @Test
    public void searchGivenElementInLinkedListIfFoundShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        INode node = myLinkedList.searchElement(30);
        Assert.assertEquals(mySecondNode,node);
    }

    /*TestCase for Inserting Element After Given Node in Linked List*/
    @Test
    public void givenFourNumbersWhenInsertingThirdNumberInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.insert(mySecondNode, myThirdNode);
        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getHead().getNext().getNext().equals(myThirdNode) &&
                myLinkedList.getTail().equals(myFourthNode);
        Assert.assertTrue(result);
    }
    /*TestCase for Deleting Specified Node in LinkedList*/
    @Test
    public void givenElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        INode deletedNode = myLinkedList.popElement(40);
        Assert.assertEquals(myThirdNode,deletedNode);
    }
    /*TestCase for Calculating size of Linked List After Deleting A Node*/
    @Test
    public void givenElementWhenDeletedShouldReduceSizeByOneShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.popElement(40);
        int size = myLinkedList.size();
        Assert.assertEquals(3,size);
    }
}
