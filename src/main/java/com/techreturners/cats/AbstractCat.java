package com.techreturners.cats;

public abstract class AbstractCat {

    private boolean isAsleep = false;

    public boolean isAsleep() {
        return this.isAsleep;
    };

    public void goToSleep() {
        this.isAsleep = true;
    }

    public void wakeUp() {
        this.isAsleep = false;
    }
}