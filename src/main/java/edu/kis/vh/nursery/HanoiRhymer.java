package edu.kis.vh.nursery;

import edu.kis.vh.nursery.bridgeStandard.IntArrayStack;
import edu.kis.vh.nursery.bridgeStandard.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }



    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) //Był źle sformatowany
            totalRejected++;
        else    //Był źle sformatowany
            super.countIn(in);    //Był źle sformatowany
    }
}
//  alt + <- przeskakuje do innego otwartego pliku w lewą stronę
//  alt + -> przeskakuje do innego otwartego pliku w prawą stronę