package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    /*Append Elements in Queue*/
    @Test
    public void givenThreeNumbersWhenAddedToQueueShouldHaveReturnFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode FirstElement = myQueue.peek();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, FirstElement);
    }

}
