package edu.kis.vh.nursery.bridgeStandard;

public interface IntArrayLinkedHierarchy {
    public final int DEFAULT_VALUE = 0;

    public void push(int i);

    public boolean isEmpty();

    public boolean isFull();

    public int top();

    public int pop();
}
