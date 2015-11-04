package com.stayyolo.amritahelloworld;

/**
 * It's a coke machine, where you insert currency and if you have inserted more than 20 Rupees
 * you get your coke
 */
public class CokeMachine {
    private static final int COST = 20;
    private int totValue;
    private int currValue;
    private boolean enabled;

    public CokeMachine() {
        totValue = 0;
        currValue = 0;
        enabled = false;
    }

    public void insert(Rupee rupee) {
        int value = rupee.getValue();
        if (value == 0) {
            System.err.println("illegal value");
        } else {
            currValue += value;
            System.out.print("Current value = " + currValue);
            if (currValue >= COST) {
                enabled = true;
                System.out.println(" (sufficient credit)");
            } else System.out.println("");
        }
    }

    public int returnCoins() {
        int ret = 0;
        if (currValue == 0) {
            System.err.println("no coins to return");
        } else {
            System.out.println("Take your coins");
            ret = currValue;
            currValue = 0;
            enabled = false;
        }
        return ret;
    }

    public void giveMeCoke() throws Exception {
        if (enabled) {
            System.out.println("Get your Coke");
            totValue += COST;
            currValue -= COST;
            if (currValue == 0) enabled = false;
            System.out.println("Current value = " + currValue);
        } else {
            System.out.println("Not enough credit: add " + (COST - currValue));
        }
        if (currValue < 0) throw new Exception("Error: negative credit!");
    }
}