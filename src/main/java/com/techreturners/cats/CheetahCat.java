package com.techreturners.cats;

public class CheetahCat extends AbstractCat implements Cat {

    public String getSetting() {
        return "wild";
    }

    public int getAverageHeight() {
        return 45;
    }

    public String eat() {
        return "Zzzzzzz";
    }
}