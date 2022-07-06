package com.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
