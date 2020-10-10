package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyNodeTest {
    @BeforeClass
    public static void beforeClass(){
        MyNode myNode = new MyNode(56);
        boolean result = myNode.printWelcomeMessage();
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
