package com.sam.withdrawservice.configuration;

public class WithdrawConfiguration {

    private int maximum;
    private int minimum;

    protected WithdrawConfiguration(){}

    public WithdrawConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

}
