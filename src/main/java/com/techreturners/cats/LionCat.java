package com.techreturners.cats;

public class LionCat extends AbstractCat implements Cat {

    public String getSetting() {
        return "wild";
    }

    public int getAverageHeight() {
        return 1100;
    }

    public String eat() {
        return "Roar!!!!";
    }
}