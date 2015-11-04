package com.stayyolo.amritahelloworld;

/**
 * This class represents Currency, that you can insert into the CokeMachine
 * to get coke :P
 */
public class Rupee {
    public static final int ONE = 1;
    public static final int FIVE = 5;
    public static final int TEN = 10;
    public static final int TWO_FIVE = 25;
    public static final int FIFTY = 50;
    public static final int HUNDRED = 100;

    public static final int INVALID = 0;

    private int value;

    public Rupee(String coin) {
        String toUpperCoin = coin.toUpperCase();
        if (toUpperCoin.equals("ONE")) value = ONE;
        else if (toUpperCoin.equals("FIVE")) value = FIVE;
        else if (toUpperCoin.equals("TEN")) value = TEN;
        else if (toUpperCoin.equals("TWO_FIVE")) value = TWO_FIVE;
        else if (toUpperCoin.equals("FIFTY")) value = FIFTY;
        else if (toUpperCoin.equals("HUNDRED")) value = HUNDRED;
        else value = INVALID;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}
