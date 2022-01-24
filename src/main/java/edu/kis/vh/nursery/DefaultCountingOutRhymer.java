package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeStandard.IntArrayStack;

public class DefaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

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
