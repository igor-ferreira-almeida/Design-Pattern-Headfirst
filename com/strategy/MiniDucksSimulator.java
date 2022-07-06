package com.strategy;

public class MiniDucksSimulator {

	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		
		duck.performFly();
		duck.performQuack();
	}

}
