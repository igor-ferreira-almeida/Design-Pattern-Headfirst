package com.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
