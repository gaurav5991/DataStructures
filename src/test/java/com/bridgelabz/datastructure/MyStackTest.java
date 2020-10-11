package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    /*Add Elements in Stack*/
    @Test
    public void givenThreeNumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode LastElement = myStack.peek();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, LastElement);
    }

    /*Peek and Pop Elements From Stack*/
    @Test
    public void givenThreeNumbersWhenPoppedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode poppedNode = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, poppedNode);
    }
}
