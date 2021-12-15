package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) //Był źle sformatowany
			totalRejected++;
		else	//Był źle sformatowany
			super.countIn(in);	//Był źle sformatowany
	}
}
