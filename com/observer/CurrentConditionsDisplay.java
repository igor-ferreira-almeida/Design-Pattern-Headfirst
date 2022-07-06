package com.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degress and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		this.display();
	}

}
