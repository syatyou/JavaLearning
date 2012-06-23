package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.car.Car;

public class Truck extends Car {
	
	@Override
	public int getFuelCost() {
		return 5;
	}
	
	@Override
	protected char getWheelRuts() {
		return 'ƒ°';
	}
}
