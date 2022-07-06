package com.decorator;

public class Descaf extends Beverage {

    public Descaf() {
        super.description = "Descaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
