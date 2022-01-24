package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeStandard.IntArrayLinkedHierarchy;
import edu.kis.vh.nursery.bridgeStandard.IntArrayStack;
import edu.kis.vh.nursery.bridgeStandard.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final IntArrayLinkedHierarchy stos = new IntArrayStack();

    public FIFORhymer(){}

    public FIFORhymer(IntArrayStack intArrayStack){
        super(intArrayStack);
    }

    public FIFORhymer(IntLinkedList intLinkedList){
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            stos.push(super.countOut());

        int ret = stos.pop();

        while (!stos.isEmpty())
            countIn(stos.pop());

        return ret;
    }
}
