package org.aon.task1.part1;


public class MyIncDec implements IncDec {
    // Private variable to store the value
    private int x;

    // Constructor to initialize the value
    public MyIncDec(int x) {
        this.x = x;
    }

    // Method to increment the value
    public void increment() {
        this.x++;
    }

    // Method to decrement the value
    public void decrement() {
        this.x--;
    }
}
