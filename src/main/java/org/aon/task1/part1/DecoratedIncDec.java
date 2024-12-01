package org.aon.task1.part1;

public class DecoratedIncDec implements IncDec {

    // The original IncDec object being decorated
    private final IncDec original;

    public DecoratedIncDec(IncDec original) {
        this.original = original;
    }

    @Override
    public void increment() {
        long startTime = System.currentTimeMillis();
        original.increment();
        long endTime = System.currentTimeMillis();

        System.out.println("Increment method took " +
                (endTime - startTime) + " milliseconds");
    }

    @Override
    public void decrement() {
        long startTime = System.currentTimeMillis();
        original.decrement();
        long endTime = System.currentTimeMillis();

        System.out.println("Decrement method took " +
                (endTime - startTime) + " milliseconds");
    }
}

