package edu.kis.vh.nursery;

/**
 * A class that extends DefaultCountingOutRhymer to collect rejections
 * Contains int that keeps sum of rejections
 * Possible methods except extended class:
 * reportRejected/getTotalRejected - returns sum of rejections
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    // TODO: this method looks unnecessary, because we have already reportRejected(), which does the same
    public int getTotalRejected() {
        return totalRejected;
    }
}
