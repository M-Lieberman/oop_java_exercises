package com.techreturners.cats;

public class DomesticCat extends AbstractCat implements Cat {

    public String getSetting() {
        return "domestic";
    }

    public int getAverageHeight() {
        return 23;
    }

    public String eat() {
        return "Purrrrrrr";
    }
}