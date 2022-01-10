package edu.kis.vh.nursery.list;

public class IntArrayStack {
    public static final int CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT_VALUE = -1;
    public static final int IF_FULL = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = in;
    }

    public boolean callCheck() {
        return getTotal() == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return getTotal() == IF_FULL;
    }

    public int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[getTotal()];
    }
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[setTotal(getTotal() - 1)+1];
    }

    public int setTotal(int total) {
        this.total = total;
        return  total;
    }
}
