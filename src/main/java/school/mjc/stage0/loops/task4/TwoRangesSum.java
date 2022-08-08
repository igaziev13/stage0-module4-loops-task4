package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow && lastInRow>0)
            System.out.println("number to skip is bugger then the last");
        else if (lastInRow<0)
            System.out.println("last number in row is negative");
        else {
            int skipped = 0, counted = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (numberToSkip >= i) {
                    skipped = skipped + i;
                    continue;
                }
                counted = counted + i;
            }
            System.out.println("skipped sum is " + skipped + "\ncounted sum is " + counted);
        }
    }
}
