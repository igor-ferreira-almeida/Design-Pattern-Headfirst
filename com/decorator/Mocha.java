package com.decorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    @Override
    public double cost() {
        return this.beverage.cost() + .2;
    }
}
