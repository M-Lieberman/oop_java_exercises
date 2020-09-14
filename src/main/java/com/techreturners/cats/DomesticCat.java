package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AbstractCat implements Cat {

    public String getSetting() {
        return "domestic";
    }

    public int getAverageHeight() {
        return 23;
    }

    public String eat() {
        Random random = new Random();
        int r = random.nextInt(10);
        if (r > 3) {
            return "Purrrrrrr";
        } else {
            return "It will do I suppose";
        }
    }
}