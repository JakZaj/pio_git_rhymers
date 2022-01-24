package edu.kis.vh.nursery.bridgeStandard;

public class IntArrayStack implements IntArrayLinkedHierarchy{
    public static final int CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int IF_FULL = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;




    @Override
    public void push(int i) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = i;
    }

    @Override
    public boolean isEmpty() {
        return getTotal() == EMPTY_RHYMER_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return getTotal()==IF_FULL;
    }

    @Override
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[getTotal()];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[setTotal(getTotal() - 1)+1];
    }

    public int getTotal() {
        return total;
    }

//    public void countIn(int in) {
//        if (!isFull())
//            numbers[setTotal(getTotal() + 1)] = in;
//    }

//    public boolean callCheck() {
//        return getTotal() == EMPTY_RHYMER_INDICATOR;
//    }
//
//    public int peekaboo() {
//        if (callCheck())
//            return DEFAULT_VALUE;
//        return numbers[getTotal()];
//    }
//    public int countOut() {
//        if (callCheck())
//            return DEFAULT_VALUE;
//        return numbers[setTotal(getTotal() - 1)+1];
//    }

    public int setTotal(int total) {
        this.total = total;
        return  total;
    }
}
