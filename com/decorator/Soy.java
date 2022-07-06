package com.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .15;
    }
}
