package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeStandard.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final IntArrayStack stos = new IntArrayStack();

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
