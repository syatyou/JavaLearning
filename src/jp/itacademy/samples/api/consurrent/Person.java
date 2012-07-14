package jp.itacademy.samples.api.consurrent;

public class Person implements Runnable {
	
	private String name;
	private Seat seat;
	
	public Person(String name, Seat seat) {
		this.name = name;
		this.seat = seat;
	}
	
	public void run() {
		while (true) {
			seat.hold(name);
		}
	}

}
