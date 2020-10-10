package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.BeforeClass;

public class MyNodeTest {
    @BeforeClass
    public static void beforeClass(){
        MyNode myNode = new MyNode();
        boolean result = myNode.printWelcomeMessage();
        Assert.assertTrue(result);
    }
}
