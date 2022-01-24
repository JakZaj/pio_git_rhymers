package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeStandard.IntArrayLinkedHierarchy;
import edu.kis.vh.nursery.bridgeStandard.IntArrayStack;
import edu.kis.vh.nursery.bridgeStandard.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IntArrayLinkedHierarchy intArrayStack=new IntArrayStack();

    public DefaultCountingOutRhymer() {
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intArrayStack = intLinkedList;
    }


//    public int getTotal() {
//        return intArrayStack.getTotal();
//    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.pop();
    }

    public int peekaboo() {
        return intArrayStack.top();
    }
}
